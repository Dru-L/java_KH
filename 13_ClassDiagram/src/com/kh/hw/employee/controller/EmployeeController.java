package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController{
	// 멤버 필드
	private Employee e;
	
	public EmployeeController() {
		e = new Employee();
	}
	
	public void add(int empNo, String name, char gender,String phone) {
	//매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
	// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
	//매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
	// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone){
	// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setPhone(phone);
	}
	
	public void modify(int salary){
	// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setSalary(salary);
	}
	
	public void modify(double bonus){
	// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setBonus(bonus);
	}
	
	public Employee remove(){
	// 객체 e에 null을 저장하여 객체 삭제
		e = null;
		return e;
	}
	public String inform(){
	// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환
		if (e == null) {	
			return null;
		}
		return e.printEmployee();
	}
}
