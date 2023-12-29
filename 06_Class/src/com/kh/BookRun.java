package com.kh;

public class BookRun {
	public static void main(String[] args) {
//		int num = 1;
		//Book 클래스 객체 생성
		Book b1 = new Book();
		b1.setTitle("어린왕자"); //호출할 때는 set
//		System.out.println(b1.getTitle()); // 출력할때는 get
//		b1.setNumber(num++);
//		b1.addNumber();
		System.out.printf("%s (%d)\n", b1.getTitle(), b1.getCurrNumber());
		
		Book b2 = new Book();
		b2.setTitle("수학의 정석");
//		b2.addNumber();
		System.out.printf("%s (%d)\n", b2.getTitle(), b2.getCurrNumber());
		
		//static 메소드: 객체 생성없이 바로 호출이 가능하다. 클래스명.메소드명();
//		Math.random();
//		System.arraycopy(b1, num, b2, num, num);
		
		
	}
}
