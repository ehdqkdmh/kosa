package com.coderby.myapp.hr.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderby.myapp.hr.model.UserVO;

import com.coderby.myapp.hr.service.IUsersService;

@Controller
@RequestMapping("/user") //모든 메서드에 이 경로가 지정된다! 좀 더 구조화된 경로를 가질 수 있음 
public class UsersController {
	
	@Autowired
	IUsersService userService;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)//emp/count 
	public String insertUser(){ 
	
		return "user/insertform"; //WEB-INF/views/emp/count.jsp
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertUser(UserVO user,Model model){
		System.out.println(user);
		try{
			userService.insertUser(user);
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
		}
		return "redirect:/user/list"; 
		
		
	}
	
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateUser(HttpSession session ,Model model){
		String userId=(String)session.getAttribute("userId");
		model.addAttribute("user",userService.selectUser(userId));
		return "user/updateform";
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateUser(UserVO user,Model model){
		System.out.println(user);
		try{
			userService.updateUser(user);
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
		
		}
		return "redirect:/user/list"; 
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "user/loginform";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String userId, String userPassword, HttpSession session){
		if(userService.checkPassword(userId, userPassword)){
			session.setAttribute("userId", userId);
		}else{
			session.invalidate();
		}return "redirect:/user/list";
		
		
	}
	
	
	
	
//	@RequestMapping(value="/update", method=RequestMethod.GET)
//	public String updateuser(HttpSession session, Model model) {
//		String userId = (String)session.getAttribute("userId");
//		model.addAttribute("user", userService.selectUser(userId));
//		return "user/updateform";
//	}
	
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteUser(){
	
		return"user/deleteform";
		
	}
	
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteUser(HttpSession session,String userPassword){
		String userId = (String)session.getAttribute("userId");
		userService.deleteUser(userId, userPassword);
		return"home";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET) //  /emp/list
	public String getUserList(Model model){
		model.addAttribute("user", userService.selectAllUser());
		return "user/list";
	}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String getUser(String userId, Model model){
		model.addAttribute("user",userService.selectUser(userId));
		return "user/view";
	}
	
	
	
}
