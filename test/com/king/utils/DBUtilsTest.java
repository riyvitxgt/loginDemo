package com.king.utils;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilsTest {

	@Test
	public void test() {
		Connection conn = DBUtils.getConnection();
		System.out.println("³É¹¦");
	}

}
