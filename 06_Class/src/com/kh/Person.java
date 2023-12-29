package com.kh;

public class Person {
	//이름,나이, 핸드폰번호
	//데이터 (인스턴스 변수)
	private String name; //private => 클래스 안에서만 접근하게 (접근 제한)
	//중요한 정보들을 외부에서 접근하지 못하게 하기위해서 사용. =>보통 개인정보에 사용.
	int age = 0;
	String phone ="";
	
	//기능(인스턴스 메소드)
	//생성자 : 초기화
	//public Person() {}
	public Person(String name, int age, String phone){//클래스 이름 그대로
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public Person(String name) {
		this.name = name; //이름값만 받겠다
	}
	
	//getter,setter
	//name 변수의 값을 확인
	public String getName() {
		return name;//return => 반환
	}	
	//name 변수에 값을 대입
	public void setName(String name) { //setName메소드
		if(name == "%"){ //만약 이상한 데이터가 들어오면
			return; //종료시켜라
		}
		this.name = name; //this. => 대입
	}
	//get과 set은 private을 이용했을 때 외부 클래스에서 출력할 수 있게 도와줌.
	
	public void printInfo() {
		System.out.printf("%s %d %s\n",name,age,phone);
	}
			
}
