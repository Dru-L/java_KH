package com.kh.inherit;

public class Run {
	public static void main(String[] args) {
		
		//다형성 : 같은 코드에서 여러 실행 결과가 나오는 것
		//		 공통적인 부분은 부모클래스에서 정의하고, 
		//		 자식클래스는 필요에 따라 추가 요소만 정의
		//Panda 클래스 객체 생성
		Panda panda = new Panda();
		panda.setCrySound(null); 
		panda.showCrySound();
		panda.setCrySound("꾸엑");
		panda.showCrySound(); //다형성
		
		//Bird 클래스 객체 생성
		Bird bird = new Bird();
		bird.setCrySound(null); //오버라이딩 => 짹짹 //필요에 따라 재정의
		bird.showCrySound();
		bird.setCrySound("삐에에에에엑");
		bird.showCrySound(); //다형성
	}
}
