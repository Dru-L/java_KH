package com.kh.object;

//부모 클래스로 사용한 Vihicle
public class Vehicle {
	String melody = "빵빵";	//경적 소리
	boolean isMove;			//주행 상태
	
	public void move() {
		//주행상태를 움직이고 있다고 출력
		//주행 중 : true
		isMove = true;
	}
	public void stop() {
		//멈췄다고 출력
		isMove = false;
	}
	public boolean checkMove(){
		//주행상태 출력 및 주행상태 반환
		if (isMove) {
			System.out.println("주행중 입니다.");
		}else {
			System.out.println("멈춘 상태입니다.");
		}
		return isMove;
	}
	public void setMelody(String melody){
		//경적 소리를 설정
		this.melody = melody;
	}
	public void singingBell() {
		//경적 소리 출력
		System.out.println(melody);
	}
}

