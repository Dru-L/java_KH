package com.kh.jdbc.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.jdbc.vo.MemberGrade;

public class MemberGradeDao {
	
	// java에서 Oracle 데이터 출력하기 (Statement)
	public List<MemberGrade> findAll() {
		List<MemberGrade> grades = new ArrayList<>();
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//JDBC 드라이버 등록 (try~catch 삽입)
			Class.forName("oracle.jdbc.driver.OracleDriver");// 오라클
			
			//Connection 객체 메소드 호출 (Connection 객체는 밖으로 빼고, DriverManager는 try~catch 삽입)
			// 맨뒤에는 연결할 계정과 패스워드로 수정
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "C##KH", "KH");
			
			//Statement(Statement 및 ResultSet객체는 밖으로 뺀다)
			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT * FROM MEMBER_GRADE"); // 쿼리문은 오라클에서 사용하는 select문
			
//			System.out.println(rs.next());  //rs.next() 조회해서 가져올 행이 있으면 true를 리턴하면서 첫번째 행을 가리키는 중
			
			/*while(rs.next()) {  // rs.next()가 false가 될때까지 행을 쭉 리턴
				// rs.getInt("GRADE_CODE") : GRADE_CODE안에 있는 컬럼값을 가져오겠다.(Int)
				System.out.println(c));
				// rs.getString(2) : 2번째 컬럼에 있는 값을 조회해서 가져오겠다.(String)
				System.out.println(rs.getString(2));
				// rs.getDate() : 날짜값 출력
				System.out.println(rs.getDate("CREATE_DATE"));
				System.out.println();
			}*/
			
			while(rs.next()) {
				MemberGrade grade = new MemberGrade();
				
				grade.setGradeCode(rs.getInt("GRADE_CODE"));
				grade.setGradeName(rs.getString("GRADE_NAME"));
				grade.setCreateDate(rs.getDate("CREATE_DATE"));
				
				grades.add(grade);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //사용이 다 끝나면 close 처리를 해줘야한다. 순서는 ResultSet -> Statement -> Connection
			try { 
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return grades;
		
	}
	
	// java에서 Oracle 데이터 출력하기 (PreparedStatement)
	public MemberGrade findByCode(int code) {
		MemberGrade grade = null;
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM MEMBER_GRADE WHERE GRADE_CODE = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "C##KH", "KH");
			//PreparedStatement
			pstmt = connection.prepareStatement(query);
			
			pstmt.setInt(1, code);  //첫번째 ?에 code를 넣겠다.
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				grade = new MemberGrade();
				
				grade.setGradeCode(rs.getInt(1));
				grade.setGradeName(rs.getString(2));
				grade.setCreateDate(rs.getDate(3));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { 
				rs.close();
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return grade;
	}
	
	// java에서 Oracle에 데이터 INSERT하기
	public int insert(String gradeName) {
		int result = 0;
		Connection connection = null;
		PreparedStatement pstmt = null;
		String query = "INSERT INTO MEMBER_GRADE "
				+ "VALUES(SEQ_GCODE.NEXTVAL, ?, DEFAULT)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "C##KH", "KH");
			//PreparedStatement
			pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, gradeName);
			
			result = pstmt.executeUpdate();  //// INSERT, UPDATE, DELETE 쿼리 실행 (정수값을 리턴한다.)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	// java에서 Oracle에 데이터 UPDATE하기
	public int update(int gradeCode, String gradeName, String createDate) {
		int result = 0;
		Connection connection = null;
		PreparedStatement pstmt  = null;
		String query = "UPDATE MEMBER_GRADE "
				+ "SET GRADE_NAME = ?, "
				+ "    CREATE_DATE = ? "
				+ "WHERE GRADE_CODE = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "C##KH", "KH");
			pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, gradeName);
			pstmt.setString(2, createDate);
			pstmt.setInt(3, gradeCode);
			
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	
	// java에서 Oracle에 데이터 DELETE하기
	public int delete(int gradeCode) {
		int result = 0;
		Connection connection = null;
		PreparedStatement pstmt = null;
		String query = "DELETE "
				+ "FROM MEMBER_GRADE "
				+ "WHERE GRADE_CODE = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "C##KH", "KH");
			pstmt = connection.prepareStatement(query);
			
			pstmt.setInt(1, gradeCode);
			
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
}
