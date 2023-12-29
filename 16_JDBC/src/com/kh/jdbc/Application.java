package com.kh.jdbc;

import com.kh.jdbc.practice.JdbcTest;

public class Application {

	public static void main(String[] args) {
//		new JdbcTest().findAll();
//		new JdbcTest().findByCode(30);
//		new JdbcTest().findByCode(20);
//		new JdbcTest().insert("VVIP회원");
//		new JdbcTest().insert("진상회원");
//		new JdbcTest().update(100, "그냥회원", "2023/11/15");
		new JdbcTest().delete(100);
		
	}

}
