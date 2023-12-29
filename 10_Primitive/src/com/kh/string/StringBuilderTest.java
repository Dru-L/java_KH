package com.kh.string;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String str = new String("java");
		
		//String으로부터 StringBuilder를 생성
		StringBuilder builder = new StringBuilder(str);
		System.out.println("변경 전 builder의 주소 : "+System.identityHashCode(builder)); //문자열 값을 변경할때는 StringBuilder를 많이 사용
		
		builder.append(" python");
		builder.append(" C");
		builder.append(" C++");
		
		System.out.println("변경 후 builder의 주소 : "+System.identityHashCode(builder)); //주소를 별도로 변경하지않음
		System.out.println(builder.toString()); // 문자 전체 출력
		
	}
}
