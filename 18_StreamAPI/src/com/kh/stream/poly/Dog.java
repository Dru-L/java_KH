package com.kh.stream.poly;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
//		super();
//		this.name = name;
		//생성자를 통해서 필요한 값들을 초기화 하는것을 선호.
	}

	@Override
	public void eat() {
		System.out.println(this.name + "가 고구마를 먹는다.");
	}

}
