package com.kh.jdbc.practice;

import java.util.List;

import com.kh.jdbc.dao.MemberGradeDao;
import com.kh.jdbc.vo.MemberGrade;

public class JdbcTest {
	public void findAll() {
		// 객체들을 저장할 리스트 필드 생성

		List<MemberGrade> grades = new MemberGradeDao().findAll();
//		MemberGradeDao dao = new MemberGradeDao();
//		List<MemberGrade> grades = dao.findAll();
		
		for(MemberGrade grade : grades ) {
			System.out.println(grade);
		}
		
	}

	public void findByCode(int code) {
		MemberGradeDao dao = new MemberGradeDao();
		MemberGrade grade = dao.findByCode(code);
		
		System.out.println(grade);
		
	}

	public void insert(String gradeName) {
		MemberGradeDao dao = new MemberGradeDao();
		
		int result = dao.insert(gradeName);
		
		System.out.println("Result : " + result);
	}

	public void update(int gradeCode, String gradeName, String createDate) {
		MemberGradeDao dao = new MemberGradeDao();
		
		int result = dao.update(gradeCode, gradeName, createDate);
		
		System.out.println("Result : " + result);
	}

	public void delete(int gradeCode) {
		MemberGradeDao dao = new MemberGradeDao();
		
		int result = dao.delete(gradeCode);
		
		System.out.println("Result : " + result);
	}

}
