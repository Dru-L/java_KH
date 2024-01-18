package com.kh.stream.poly;

public abstract class Animal {
	/*
	 * 추상 클래스 : 
	 * 	-> 추상 메소드를 포함한 클래스(미완성의 클래스)
	 * 	-> 공통적인 부분만 모아놓은 클래스
	 * 	-> 인터페이스에서는 public, abstract 생략
	 * 	-> 인터페이스는 필드를 가질 수 없음
	 * 	-> 일반적인 추상 클래스에서는 abstract 키워드 추가
	 *  -> 인터페이스는 생성자가 없음(만들 수 없음)
	 *  -> 추상 클래스는 생성자 만들 수 있음
	 */
//	인터페이스는 상수지만, 추상클래스는 추상메소드, 일반 메소드 모두 가질수 있다.
// 추상 클래스는 가능하다면 필드도 가질 수 있다.
	protected String name;
	
//	public Animal() {
//	};
	
	public Animal(String name) {
		this.name = name;
	}

	public abstract void eat();
	// 타 클래스에서 Animal 클래스를 상속하면서 추상 메소드는 재정의를 꼭 해주어야한다.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
