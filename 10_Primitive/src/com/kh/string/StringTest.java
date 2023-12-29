package com.kh.string;

public class StringTest {
	public static void main(String[] args) {
	
		String str1 = new String("apple");
		String str2 = new String("apple");
		
		System.out.println(str1 == str2); //주소값이 다른가 => false
		System.out.println(str1.equals(str2)); //안의 문자열의 내용이 같은가 => true
		
		String str3 = "samsung"; 
		String str4 = "samsung"; //아예 값을 넣어버리면 한공간에 저장이 되고, 값이 저장된 위치를 참조
		
		System.out.println(str3 == str4); //주소값이 다른가 => true
		System.out.println(str1.equals(str2)); //안의 문자열의 내용이 같은가 => true
		
		String str5 = new String("java");
		String str6 = new String("python");
		
		System.out.println(str5);
		System.out.println("처음 문자열 주소값 :" + System.identityHashCode(str5)); //.identityHashCode() : 문자열 주소 값
		
		str5 = str5.concat(str6); // concat : 문자열을 연결해주는 메소드
								  // java+python
		System.out.println(str5);
		System.out.println("연결 후 문자열 주소값 :" + System.identityHashCode(str5));
		//문자열 값 수정 불가능
	}
	
}
