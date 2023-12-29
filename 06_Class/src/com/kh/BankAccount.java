package com.kh;

public class BankAccount {
	//클래스 = 데이터 + 기능
	
	//인스턴스 변수 (데이터)
	int balance = 0; //예금 잔액 => 관리할 정보
	
	//인스턴스 메소드(기능)
	public int deposit(int amount) {
		balance += amount; //예금 잔액에 amount를  더해라
		return balance; //그리고 인스턴스 변수 balance에 반환해라
	}
	
	public int withdraw(int amount) {
		balance -= amount; //예금 잔액에 amount를 빼라
		return balance;//그리고 인스턴스 변수 balance에 반환해라
	}
	
	//CRUD >  Create(추가), Read(조회), Update(수정), Delete(삭제)
	
	public int checkMyBalance() {
		System.out.println("잔액 : "+ balance);
		return balance;
	}
}
