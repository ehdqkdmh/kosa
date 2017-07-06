package com.coderby.myapp.hr.dao;

import java.util.List;

import com.coderby.myapp.hr.model.UserVO;


public interface IUsersRepository {
	
	
	
	void insertUsers(UserVO user);
	void updateUsers(UserVO user);
	void deleteUsers(String userId,String userPassword);
	
	UserVO selectUsers(String userId);
	List<UserVO> selectAllUser();
	
	String getPassword(String userId);
}
