package com.king.dao;

import java.util.List;

import com.king.entity.User;

public interface UserDao {
	//保存用户
	public boolean save(User user);
	//修改用户
	public boolean update(User user);
	//删除用户
	public boolean delete(long id);
	//查找单个用户
	public User findById(long id);
	//获取所有用户
	public List<User> findAll();
}
