package com.kh.object;

public class Run {
	public static void main(String[] args) {
		// car 객체 생성
		Car carA = new Car();
		carA.singingBell();
		carA.setMelody("뛰뛰");//부모 class의 상속을 받아 해당 객체를 통해 사용 가능.
		carA.singingBell();
		
		//Bus 객체 생성
		Bus busA = new Bus();
		busA.singingBell();
		busA.setMelody("빠아아아아앙");
		busA.singingBell();
	}
}
