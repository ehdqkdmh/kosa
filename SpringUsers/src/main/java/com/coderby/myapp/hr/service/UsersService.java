package com.coderby.myapp.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderby.myapp.hr.dao.IUsersRepository;
import com.coderby.myapp.hr.dao.UsersRepository;
import com.coderby.myapp.hr.model.UserVO;



@Service
public class UsersService implements IUsersService {
	@Autowired
	IUsersRepository userRepository;
	@Override
	public void insertUser(UserVO user) {
		userRepository.insertUsers(user);
		
	}

	@Override
	public void updateUser(UserVO user) {
		// TODO Auto-generated method stub
		userRepository.updateUsers(user);
		
	}

	@Override
	public void deleteUser(String userId, String userPassword) {
		// TODO Auto-generated method stub
		userRepository.deleteUsers(userId, userPassword);
	}

	@Override
	public UserVO selectUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.selectUsers(userId);
	}

	@Override
	public List<UserVO> selectAllUser() {
		// TODO Auto-generated method stub
		return userRepository.selectAllUser();
	}

	@Override
	public boolean checkPassword(String userId, String userPassword) {
		// TODO Auto-generated method stub
		String pw= userRepository.getPassword(userId);
		if(pw!=null&&pw.equals(userPassword)) {
			return true;
		} else{
			return false;
		}
	}

}
