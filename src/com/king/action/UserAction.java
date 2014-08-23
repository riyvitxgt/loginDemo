package com.king.action;

import org.apache.struts2.convention.annotation.Action;

import com.king.dao.UserDaoImpl;
import com.king.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user;
	@Action("user")
	public String login(){
		UserDaoImpl userDao = new UserDaoImpl();
		if(userDao.checkUser(user.getName(), user.getPassword())){
			return "userList";
		}else{
			return "error";
		}
		
	}

	@Override
	public User getModel() {
		if(user == null){
			user = new User();
		}
		return user;
	}
}
