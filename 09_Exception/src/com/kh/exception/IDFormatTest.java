package com.kh.exception;

public class IDFormatTest {
	//변수 : 사용자 ID(문자열, '-' ->클래스 내부에서만 접근)
	private String userID;
	
	// 사용자ID getter 메소드
	public String getUserID() {
		return userID;
	}
	
	//사용자 ID setter 메소드
	// [1] 전달받은 값이 null인 경우에 저장하지 않고 "아이디는 null일 수 없습니다." 출력
	// [2] 전달받은 값의 길이가 8 이상 20 이하만 저장
	//	   범위를 벗어날 경우, "아이디는 8자 이상 20자 이하로 쓰세요" 출력
	public void setUserID(String userID) throws IDFormatException{ //전달하고
		//조건에 맞지 않은 경우 IDFormatException 예외 발생시키기
		//throw new 예외 클래스명();
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다."); //발생시키면 그 위치에서 멈추고 던져라. 아래 내용은 수행되지 않음.
		}else if(userID.length()<8 || userID.length()>20){
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		
		this.userID = userID; //예외들이 발생하지 않았을 때는 실행안함.

		// throw 없이 조건문으로 사용시
//		if (userID == null) {
//			System.out.println("아이디는 null일 수 없습니다.");
//		}else if(userID.length()<8 || userID.length()>20){
//			System.out.println("아이디는 8자 이상 20자 이하로 쓰세요.");
//		}else {
//			this.userID = userID;
//		}
	}	

	public static void main(String[] args){
		IDFormatTest test = new IDFormatTest();
		
		try { //throw를 쓸때는 try catch문으로 묶어줘야한다.
			String userID = null;  //userID를 null로 지정했을때
			test.setUserID(userID);  //출력 => 아이디는 null일 수 없습니다. 나옴
			System.out.println("현재ID: " + test.getUserID());  //조건문 타서 따로 저장 안됨.
		} catch(IDFormatException e) {
			System.out.println("[Exception]" + e.getMessage());
		}
		
		try {
			String userID2 = "123456";  //userID를 123456로 지정했을때
			test.setUserID(userID2);  //출력 => 아이디는 8자 이상 20자 이하로 쓰세요.
			System.out.println("현재ID: " + test.getUserID());  //조건문 타서 따로 저장 안됨.
		} catch(Exception e) { //부모 클래스를 입력해도 확인 가능함. <= 오버라이딩
			System.out.println("[Exception]" + e.getMessage());
			e.printStackTrace(); //
		}
	}


}
