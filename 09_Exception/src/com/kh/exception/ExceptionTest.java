package com.kh.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ExceptionTest {
	/*예외 (Exception)
	 * :소스 수정으로 해결 가능한 에러(오류) => 파일이 끝까지 실행되지 않음
	 * 
	 * * 예외 처리 : 예측 가능한 예외를 처리하는 방법
	 * 
	 * * Checked Exception : 반드시 예외처리를 해야하는 예외
	 * 	 Exception,IOException, FileNotFoundException, ....
	 * 
	 * * Unchecked Exception : 필수적으로 예외처리 하지 않아도 되는 예외
	 * 						   프로그램 실행에 영향을 주진않지만, 흐름상 오류가 있는 경우 예외 발생
	 * 	 RuntimeException, ArithmeticException, NullPointerException, ...
	 * 
	 * * 예외 처리 방법(2가지)
	 * [1] 예외가 발생한 위치에서 직접 처리 (try ~ catch)
	 * 		[구조]
	 * 		try {
	 * 			// 예외가 발생할 가능성이 있는 부분 작성
	 *		} catch (예상되는예외클래스명 참조변수명){
	 *			// 예외가 발생 시 해당되는 예외에 대해 처리할 내용 작성
	 *			// 예외 내용 확인 메소드 명 : 참조변수명.getMessage()
	 *			// 예외 발생 지점, 호출된 메소드 등 자세한 정보 출력 : 참조변수명.printStackTrace()
	 *		} finally {
	 *			// 예외 발생 유/무에 상관 없이 반드시 처리할 부분 작성
	 *		}
	 *
	 * [2] 호출한 메소드에게 예외를 전달 (회피) : throws 사용
	 * 		[구조]
	 * 		메소드 선언부 throws 발생되는예외클래스명 {}
	 * 		
	 * 		* 예외 발생 시키는 방법 : throw 사용
	 * 		[사용법]
	 * 		throw new 예외클래스명();  // 예외클래스를 발생시킨다.
	 * 
	 * ** 예외 처리를 하는 순간 (타이밍)
	 *   //Checked Exception
	 *   오류가 발생시 바로 빨간 줄이 그어지기 때문에(무조거 처리를 해야해서), 해당 빨간 줄을 보자마자 바로 처리해주면 된다.
	 * 	//Unchecked Exception
	 * 	보통 우리가 해왔던 if 조건문 처럼 미리 조건이 있다면 if문으로 예외처리를 하고, 실행했을 때 나오는 예외처리 부분을 try~catch나 if문으로 대부분 묶어준다.
	 *		
	 */
	
	public static void main(String[] args) {
		//Unchecked Exception : 예외처리 필수가 아닌 예외
//		arithmeticTest();
//		inputMismatchTest();
//		arrayIndexOutofBoundsTest();
//		nullPointerTest();
		
		//Checked Exception : 반드시 예외처리가 필요한 예외
		fileNotFoundTest();
		
	}
	
	public static void arithmeticTest() {
		//ArithmeticException : 산술관련 예외
		int n1 = 10;
		int n2 = 0;
		
		System.out.println("=====ArithmeticException====");
		if (n2 > 0) { //if로 조건을 넣어서 오류 잡을 수 있다.
			System.out.println(n1/n2);
		}
		System.out.println("============================");
		
//		만약 if문 안썼을 때		
//		Exception in thread "main" =====ArithmeticException====  //예외가 발생함 !
//		java.lang.ArithmeticException: / by zero  //0으로 나누려고했다
//		at com.kh.exception.ExceptionTest.arithmeticTest(ExceptionTest.java:49) // 49번쨰 줄에서 예외 발생
//		at com.kh.exception.ExceptionTest.main(ExceptionTest.java:40)  //main에서 40번째 줄에서 실행함
	}
	
	public static void inputMismatchTest() {
		// InputMismatchException : 입력이 잘못된 경우
		Scanner sc = new Scanner(System.in);
		boolean bCheck = false; // 원래 boolean 기본값 : false
		int n1;
		
		System.out.println("=====InputMismatchException====");
		while(!bCheck) { //입력이 잘못되었을때
			try {  //try ~ catch 문으로 오류를 잡기
				System.out.print("정수 입력 : ");
				n1 = sc.nextInt();
				bCheck = true;
			} catch(InputMismatchException e) {
				System.out.println("입력이 잘못되었습니다.");
				System.out.println(e.getMessage()); //오류 메세지 확인하겠다.
				bCheck = false;
			}finally {
				sc.nextLine();
			}
		}
		System.out.println("============================");
		
//		만약 try catch 안썼을 때 정수 아닌 것을 입력한 경우		
//		Exception in thread "main" java.util.InputMismatchException
//		at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//		at java.base/java.util.Scanner.next(Scanner.java:1594)
//		at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//		at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//		at com.kh.exception.ExceptionTest.inputMismatchTest(ExceptionTest.java:67) // 내가 작성한 코드 위치
//		at com.kh.exception.ExceptionTest.main(ExceptionTest.java:43) //main 43번째 줄에서 실행함
	}
	
	public static void arrayIndexOutofBoundsTest() {
		//ArrayIndexOutofBounds Exception : 배열 길이를 벗어난 예외
		int[] arr = {10, 20, 30};
		
		System.out.println("====ArrayIndexOutofBoundsException====");
		//해결방법 [1] 반복문 조건식 변경 (범위를 i<arr.length 으로 변경)
		//해결방법 [2] try ~ catch 문 사용
		try {
			for(int i=0; i<4; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[Exception] " + e.getMessage());
		}
		System.out.println("============================");

// 		예외 처리 안했을 때
//		====ArrayIndexOutofBoundsException====
//		10
//		20
//		30  //배열 길이 만큼 출력하다가
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3  //배열 길이를 벗어났다.
//		at com.kh.exception.ExceptionTest.arrayIndexOutofBoundsTest(ExceptionTest.java:106)  //내가 작성한 코드 위치
//		at com.kh.exception.ExceptionTest.main(ExceptionTest.java:45) //main 4번째 줄에서 실행함
	}
	
	public static void nullPointerTest() throws NullPointerException{ //[방법1] throws로 회피하는 방법
		//NullPointerException : null 관련 예외
		String str = null;  // String 초기값 : null
		System.out.println("====NullPointerException====");
		System.out.println(str);
		//[방법2] if문 쓰기
		if (str != null) {
			int len = str.length();
		}
		
		//[방법3] try catch 문 쓰기
		try {
			int len = str.length();  //만약 이 안에 if문을 쓴다면, catch문에서 예외발생 처리는 안하고 지나감. <=예외발생이 안되기 때문
		}catch (NullPointerException e) {
			System.out.println("[Exception] " + e.getMessage());
		}
		System.out.println("============================");
		
//		예외처리 안했을 때
//		====NullPointerException====
//		null
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
//		at com.kh.exception.ExceptionTest.nullPointerTest(ExceptionTest.java:132)
//		at com.kh.exception.ExceptionTest.main(ExceptionTest.java:48)
	}
	
	public static void fileNotFoundTest() /*throws FileNotFoundException*/{ //throws를 쓰면 여기는 main 부분에 오류가 뜸 <= main에도 throws를 써야하는 이슈가 생김
		//FileNotFoundException :  파일을 관련 예외 (파일을 찾지 못했다)
		FileInputStream fis = null;
		
		System.out.println("====FileNotFoundException====");
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e){
			e.printStackTrace(); //해당 오류 내용이 쫙 뜬다
		}
		System.out.println("============================");
//		fis = new FileInputStream("a.txt"); <= 이렇게만 썼을 시에 빨간색 밑줄이 그어지고 오류 내용이 뜸 (실행 안됨)
//		Unhandled exception type FileNotFoundException => 오류 내용 : 파일자체가 없다.
	}
	
}
