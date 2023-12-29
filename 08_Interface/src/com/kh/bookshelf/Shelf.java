package com.kh.bookshelf;

import java.util.ArrayList;

public class Shelf {
	// 변수.
	// (1)shelf 이름의 ArrayList 사용한 문자열 배열.
	// 상속받은 클래스(#) 접근 가능.
	protected ArrayList<String> shelf;
	
	// (2)생성자. 매개변수 없이. shelf 배열을 초기화.
	public Shelf() {
		shelf = new ArrayList<>(); //초기화는 클래스 안에서(약속)
	}
	// 메소드.
	//(1)shelf 변수 getter 메소드.
	public ArrayList<String> getShelf(){
		return shelf;	
	}
	//(2)getCount 이름의 shelf 배열의 크기를 결과로 반환해주는 메소드.
	public int getCount() {
		return shelf.size();
	}
}
