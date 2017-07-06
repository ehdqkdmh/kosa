package com.coderby.myapp.hr.service;

import java.util.List;

import com.coderby.myapp.hr.model.UserVO;

public interface IUsersService {
	void insertUser(UserVO user);
	void updateUser(UserVO user);
	void deleteUser(String userId,String userPassword);
	UserVO selectUser(String userId);
	List<UserVO> selectAllUser();
	boolean checkPassword(String userId,String userPassword);
}
