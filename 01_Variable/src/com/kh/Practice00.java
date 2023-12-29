package com.kh;

public class Practice00 {
	public static void main(String[] args) {
		//상수
		final int MAX;
		MAX = 100;
		
		System.out.println("상수 MAX : " + MAX);
	}
	
	public static void method1() {
		//기념일 계산
		System.out.println(2333 + 10); // 10일후
		System.out.println(2333 / 365); // 기념일 기준 몇년 째?
		System.out.println(2333 * 24); // 기념일 기준 시간 단위로.
		System.out.println(2333 * 24 * 60); // 분 단위로.
		System.out.println(2333 * 24 * 60 * 60); //초 단위로.
		System.out.println("--------------");
		
		//변수를 사용하면?
		int day = 2333;
		int p = 10;
		int y = 365;
		int m = 24;
		int s = 60;
		
		System.out.println(day + p); 
		System.out.println(day / y); 
		System.out.println(day * m); 
		System.out.println(day * m * s);
		System.out.println(day * m * s * s);		
	}
	
	public static void method2(){
		//변수명 제약사항
		// 1)자바는 대소문자를 구분한다.
		int level;
		int Level = 0;
		
		level = 10;
		
		System.out.println(" level : " + level + ", Level :" + Level);
		
		// 2)변수의 이름은 숫자로 시작할 수 없다.
		//int 365h;
		
		// 3) $, _ 외에는 특수 문자는 사용할 수 없다.
		int $100 = 100;
		int _100 = 100;
		System.out.println("$100 : "+ $100);
		System.out.println("_100 : "+ _100);
		
		// 4) 키워드(예약어)는 사용 할 수 없다.
		//double int;
		//int this;
	}
}
