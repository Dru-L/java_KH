package com.kh;

public class BankAccount00 {
	public static void main(String[] args) {
		// 인스턴스 생성 
		BankAccount kim = new BankAccount(); //클래스 및 참조변수 kim 선언 => 새로운 kim의 인스턴스 생성
		BankAccount lee = new BankAccount(); //클래스 및 참조변수 lee선언 => 새로운 lee의 인스턴스 생성
		
		//입금 메소드.5000씩 입금
		int money = kim.deposit(5000); //인스턴스 deposit 호출
		lee.deposit(5000); //int에 대입해도 되고, 그냥 호출해도 된다.
		//sc.nextLine();과 같은 예시이다.
		
		//출금 메소드를 사용해서 kim 참조변수에서는 1500출금
		//lee 변수에서는 3000출금
		kim.withdraw(1500);
		lee.withdraw(3000);
		
		//잔액 확인하는 인스턴스 checkMyBalacne 호출
		kim.checkMyBalance();
		lee.checkMyBalance();
		
	}
}
