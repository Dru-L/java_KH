package com.kh.bookshelf;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{
	/*Shelf 클래스를 상속받고,
	 * Queue 인터페이스를 구현
	 * 	[1] enQueue : shelf 배열에 전달받은 값을 추가
	 * 	[2] deQueue : shelf 배열에 첫번째 위치의 값을 제거하여 그 값을 반환
	 * 	[3] getsize : getCount() 호출하여 반환
	 */
	@Override
	public void enQueue(String title) {
		super.shelf.add(title);  //super.는 생략 가능
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override
	public int getSize() {
		return getCount();
	}
	
}
