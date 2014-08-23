package com.king.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.king.entity.User;

public class UserDaoImplTest {

	@Test
	public void test() {
		UserDao userDao = new UserDaoImpl();
		/*User user = new User();
		user.setName("aa");
		user.setPassword("password");
		userDao.save(user);*/
		//System.out.println(userDao.update(user));
		/*List<User> userList = userDao.findAll();
		for(User u : userList){
			System.out.println(u.getId() + "   " + u.getName() + "  " + u.getPassword());
		}*/
		//System.out.println(userDao.delete(1));
		User user = userDao.findById(2l);
		if(user != null){
			System.out.println(user.getName());
		}else{
			System.out.print("没有该用户");
		}
	}

}
