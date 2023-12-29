package com.kh.exception;

import java.util.Scanner;

public class IDFormatTest2 {
	//변수 : 사용자 ID(문자열, '-' ->클래스 내부에서만 접근)
	//		비밀번호(문자열, '-' ->클래스 내부에서만 접근)
	private String userID;
	private String userPW;
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
	}	
	
	//비밀번호 getter 메소드
	public String getUserPW() {
		return userPW;
	}
	
	// 비밀번호 setter 메소드
	// - 길이제한 : 8자 이상 ~ 20자 이하
	//	 범위를 벗어나면, "비밀번호 길이는 8자 이상 20자 이하여야 합니다." 내용과 함께 예외 발생
	// - 문자랑 숫자가 포함된 경우 저장
	// - 그렇지 않으면 "비밀번호는 문자와 숫자를 포함해야합니다." 예외 발생
	// 예외 클래스 추가 : PWFormatException
	public void setUserPW(String userPW) throws PWFormatException {
		if(userPW.length()<8 || userPW.length()>20) {
			throw new PWFormatException("비밀번호 길이는 8자 이상 20자 이하여야 합니다.");
		}else if(!checkChar(userPW) || !checkNumber(userPW)) {
			//!(checkChar(userPW) && checkNumber(userPW))
			//예외발생
			//비밀번호에 문자만 있거나 > checkChar:true && checkNumber:false
			//비밀번호에 순자만 있거나 > checkChar:false && checkNumber:true
			//비밀번호에 문자와 숫자 모두 없거나 > checkChar:false && checkNumber:false
			throw new PWFormatException("비밀번호는 문자와 숫자를 포함해야합니다.");
		}
		this.userPW = userPW;
	}
	
	private boolean checkChar(String str) {  //비밀번호에 문자가 포함되어있는지
		boolean bContains = false;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				//문자가 소문자 인지 확인
				bContains = true;
				break;
			}else if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
				//문자가 대문자인지 확인
				bContains = true;
				break;
			}
		}
		return bContains;
	}
	
	private boolean checkNumber(String str) {  //비밀번호에 숫자가 포함되어있는지
		boolean bContains = false;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>= '0' && str.charAt(i)<='9') {
				//숫자인지 확인
				bContains = true;
				break;
			}
		}
		return bContains;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		IDFormatTest2 test = new IDFormatTest2();
		
		String userID = null;
		String userPW = null;
		
		do {
			try {
				
				System.out.print("아이디: ");
				userID = sc.nextLine();
				test.setUserID(userID);
				
				System.out.print("비밀번호 : ");
				userPW = sc.nextLine();
				test.setUserPW(userPW);
				
			}catch(IDFormatException | PWFormatException e){
				
				System.out.println("[Exception]" + e.getMessage());
				
			}/*catch(PWFormatException e){
				System.out.println("[Exception]" + e.getMessage());
			}*/
			
			//id와 pw모두 정상적으로 입력을 했을때 반복문 종료
		}while(test.getUserID() == null || test.getUserPW() == null);
		
		
	}



}
