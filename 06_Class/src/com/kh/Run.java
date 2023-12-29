package com.kh;

public class Run {
	//이름,나이, 핸드폰번호
	/*
	String name = "김아무개";
	int age = 30;
	String phone = "010-0000-0000";
	*/
	public static void main(String[] args) {
		Person kim = new Person("김아무개",35,"010-0000-0000");
//		kim.name = "김아무개";
		kim.setName("김아무개"); //인스턴스에 이름값을 받아서 호출하겠다
		kim.age = 35;
		kim.phone = "010-0000-0000";
		System.out.println(kim.getName()); //이름 값 대입
		kim.printInfo();
		
		Person lee = new Person("이아무개");
//		lee.name = "이아무개";
		lee.setName("이아무개");
		lee.age = 48;
		lee.phone = "010-1111-1111";
		System.out.println(lee.getName()); //이름 값 대입
		lee.printInfo();
	}
}
