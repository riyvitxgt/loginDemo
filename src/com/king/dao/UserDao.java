package com.king.dao;

import java.util.List;

import com.king.entity.User;

public interface UserDao {
	//�����û�
	public boolean save(User user);
	//�޸��û�
	public boolean update(User user);
	//ɾ���û�
	public boolean delete(long id);
	//���ҵ����û�
	public User findById(long id);
	//��ȡ�����û�
	public List<User> findAll();
}
