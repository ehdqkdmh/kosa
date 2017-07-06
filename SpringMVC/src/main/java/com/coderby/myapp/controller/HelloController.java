package com.coderby.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderby.myapp.service.IHelloService;

@Controller
public class HelloController {
	@Autowired
	IHelloService ihelloservice;
	@RequestMapping(value = "/hello")
	public String hello(String name, Model model ){
		String result= ihelloservice.hello(name);
		model.addAttribute("result", result);
		
	
		return "hello";
	}
}
