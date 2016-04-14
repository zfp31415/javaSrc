package com.zfp.dao.impl;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zfp.dao.UserDao;
import com.zfp.entity.User;

public class UserDaoImpl implements UserDao {
 private NamedParameterJdbcTemplate jdbcTemplate;
	public NamedParameterJdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		String sql="insert into userlogin(username,password)values(:name,:password)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", user.getUsername());
		params.addValue("password", user.getPassword());
		
		jdbcTemplate.update(sql, params);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
        String sql ="Update userlogin set password=:name and password =:password where id= :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", user.getUsername());
        params.addValue("password",user.getPassword());
        params.addValue("id",user.getId());
        jdbcTemplate.update(sql, params);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String  sql="select *from userlogin where id=:id";
    	MapSqlParameterSource params = new MapSqlParameterSource();
    	params.addValue("id", id);
    	jdbcTemplate.update(sql, params);
	}

	@Override
	public User get(final int id) {
		// TODO Auto-generated method stub
		//User user = new User();
		String Sql ="Select *from userlogin where id = :id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id",id);
		
		   User user = jdbcTemplate.queryForObject(Sql, params, new RowMapper<User>(){

					@Override
					public User mapRow(ResultSet rs, int index)
							throws SQLException {
						 User tmpUser = new User();
						// TODO Auto-generated method stub
						 tmpUser.setId(id);
						 tmpUser.setUsername(rs.getString("username"));
						 tmpUser.setPassword(rs.getString("password"));
						return tmpUser;
					}
					  
				  });
       return user;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		String sql = "select * from userlogin";
		MapSqlParameterSource params = new MapSqlParameterSource();
		List userList = new ArrayList();
		userList = jdbcTemplate.queryForList(sql, params);
		
		return userList;
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		  String sql ="Update userlogin set password=:name and password =:password where id= :id";
	        MapSqlParameterSource params = new MapSqlParameterSource();
	        params.addValue("name", user.getUsername());
	        params.addValue("password",user.getPassword());
	        params.addValue("id",user.getId());
	       return  jdbcTemplate.update(sql, params);
	}

}
