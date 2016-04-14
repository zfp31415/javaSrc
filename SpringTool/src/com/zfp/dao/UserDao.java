package com.zfp.dao;

import java.util.List;

import com.zfp.entity.User;

public interface UserDao {
   public void save(User user);
   
   public void update(User user);
   
   public void delete(int id);
   
   public User get(int id);
   
   public List<User> list();
   
   public int insert(User user);
}
