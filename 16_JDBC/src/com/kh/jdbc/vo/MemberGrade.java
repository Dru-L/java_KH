package com.kh.jdbc.vo;

import java.util.Date;

public class MemberGrade {
	// oracle에서는 행 단위로 데이터를 저장하지만 java에서는 객체로 저장을 하기 때문에, 각 행별로 객체를 만들어주어야한다.
	//객체는 필드에 한번에 저장
	
	private int gradeCode; //등급코드 객체
	private String gradeName; //등급이름 객체
	private Date createDate ; // 날짜 객체
	//java.util.Date
	
	public MemberGrade() { 
	}
	
	public int getGradeCode() { //alt+shift+s
		return gradeCode;
	}
	public void setGradeCode(int gradeCode) {
		this.gradeCode = gradeCode;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "MemberGrade [gradeCode=" + gradeCode + ", gradeName=" + gradeName + ", createDate=" + createDate + "]";
	}

	
	
}
