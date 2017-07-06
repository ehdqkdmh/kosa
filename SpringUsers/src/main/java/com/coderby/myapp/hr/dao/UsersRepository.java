package com.coderby.myapp.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coderby.myapp.hr.model.UserVO;





@Repository
public class UsersRepository implements IUsersRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;




	@Override
	public void deleteUsers(String userId, String userPassword) {
		String sql="delete from users where user_id=? and user_password=?";
		jdbcTemplate.update(sql,userId,userPassword);
	}

	class UserMapper implements RowMapper<UserVO> {
		@Override
		public UserVO mapRow(ResultSet rs, int count) throws SQLException {
			UserVO user = new UserVO();
			user.setUserId(rs.getString("user_id"));
			user.setUserName(rs.getString("user_name"));
			user.setUserPassword(rs.getString("user_password"));
			user.setUserRole(rs.getString("user_role"));
			
			return user;
		}			
	}
	
	
	
	@Override
	public UserVO selectUsers(String userId) {
		// TODO Auto-generated method stub
		String sql="select user_id,user_name,user_password,user_role"
				+ " from users where user_id=? ";
		
	
		return jdbcTemplate.queryForObject(sql,new UserMapper(),userId); 
	
	
	
	}

	@Override
	public List<UserVO> selectAllUser() {
		// TODO Auto-generated method stub
		String sql = "select user_id,user_name,user_password,user_role from users";
//		return jdbcTemplate.query(sql, new EmpMapper());
	
		return jdbcTemplate.query(sql, new RowMapper<UserVO>() {
			@Override
			public UserVO mapRow(ResultSet rs, int count) throws SQLException {
				UserVO user = new UserVO();
				user.setUserId(rs.getString("user_id"));
				user.setUserName(rs.getString("user_name"));
				user.setUserPassword(rs.getString("user_password"));
				user.setUserRole(rs.getString("user_role"));
				return user;
			}
		});
	}

	@Override
	public String getPassword(String userId) {
		// TODO Auto-generated method stub
		
		String sql="select user_password from users where user_id=?";
		
		return jdbcTemplate.queryForObject(sql, String.class,userId);
		
		
		
		
		
		
		
	}

	@Override
	public void insertUsers(UserVO user) {
		// TODO Auto-generated method stub
		String sql = "insert into users (user_id, user_name, "
				+ "user_password, user_role) "
				+ "values (?,?,?,?)";
		jdbcTemplate.update(sql, 
				user.getUserId(), 
				user.getUserName(), 
				user.getUserPassword(),
				user.getUserRole()
				
			);
	}

	@Override
	public void updateUsers(UserVO user) {
		String sql="update users set user_name=?,user_password=?,user_role=? where user_id=?";
		jdbcTemplate.update(sql, 
				
				user.getUserName(), 
				user.getUserPassword(),
				user.getUserRole(),
				user.getUserId()
				
			);
	}

	
	
	
}
