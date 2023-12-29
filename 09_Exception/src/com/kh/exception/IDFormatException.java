package com.kh.exception;

public class IDFormatException extends Exception{ //예외처리를 하는 부모클래스
	
	// 생성자 : 문자열을 전달 받아서, 부모클래스의 생성자 호출할 때 전달
	//		  멤버변수를 초기화해주는 메소드
	//		  매개견수 : 문자열 변수
	//		  => 예외 발생시 출력할 오류 내용
	public IDFormatException(String txt) {
		super(txt); //부모클래스의 생성자 호출할 때 전달
		//예외처리에 포함된 예외를 실행하게되면 getMessage()를 통해 어떤 예외처리가 되었는지 보여줌.
	}
}
