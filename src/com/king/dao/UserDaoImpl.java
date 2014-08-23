package com.king.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.king.entity.User;
import com.king.utils.DBUtils;

public class UserDaoImpl implements UserDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rst = null;
	@Override
	public boolean save(User user) {
		conn = DBUtils.getConnection();
		String sql = "insert into user(name,password) values(?,?)";
		if(conn != null){
			try {
				pstmt = conn.prepareStatement(sql);
				if(pstmt != null){
					pstmt.setString(1, user.getName());
					pstmt.setString(2, user.getPassword());
					return pstmt.execute();
				}
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}finally{
				DBUtils.close(conn, pstmt, rst);
			}
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		conn = DBUtils.getConnection();
		if(conn != null){
			String sql = "update user set name=?, password=? where id=?";
			try {
				pstmt = conn.prepareStatement(sql);
				if(pstmt != null){
					pstmt.setString(1, user.getName());
					pstmt.setString(2, user.getPassword());
					pstmt.setLong(3, user.getId());
					return 1==pstmt.executeUpdate();
				}
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}finally{
				DBUtils.close(conn, pstmt, rst);
			}
		}
		return false;
	}

	@Override
	public boolean delete(long id) {
		conn = DBUtils.getConnection();
		if(conn != null){
			String sql = "delete from user where id=?";
			try {
				pstmt = conn.prepareStatement(sql);
				if(pstmt != null){
					pstmt.setLong(1, id);
					return pstmt.execute();
				}
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}finally{
				DBUtils.close(conn, pstmt, rst);
			}
		}
		return false;
	}

	@Override
	public User findById(long id) {
		conn = DBUtils.getConnection();
		if(conn != null){
			String sql = "select * from user where id=?";
			try {
				pstmt = conn.prepareStatement(sql);
				if(pstmt != null){
					pstmt.setLong(1, id);
					rst = pstmt.executeQuery();
					if(rst != null){
						User user = new User();
						if(rst.next()){
							user.setId(rst.getLong("id"));
							user.setName(rst.getString("name"));
							user.setPassword(rst.getString("password"));
							return user;
						}
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}finally{
				DBUtils.close(conn, pstmt, rst);
			}
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		List<User> userList = new ArrayList<User>();
		conn = DBUtils.getConnection();
		if(conn != null){
			String sql = "select * from user";
			try {
				pstmt = conn.prepareStatement(sql);
				if(pstmt != null){
					rst = pstmt.executeQuery();
					if(rst != null){
						while(rst.next()){
							User user = new User();
							user.setId(rst.getLong("id"));
							user.setName(rst.getString("name"));
							user.setPassword(rst.getString("password"));
							userList.add(user);
						}
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}

	public boolean checkUser(String name, String password){
		Connection conn = DBUtils.getConnection();
		if(conn != null){
			String sql = "select * from user where name=? and password=?";
			try {
				pstmt = conn.prepareStatement(sql);
				if(pstmt != null){
					pstmt.setString(1, name);
					pstmt.setString(2, password);
					rst = pstmt.executeQuery();
					if(rst != null){
						if(rst.next()){
							return true;
						}
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}
}
