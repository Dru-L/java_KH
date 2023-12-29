package com.kh.bookshelf;

public interface Queue {
	//[1]
	//메소드명 : enQueue
	//매개변수 : 문자열 title
	//반환값 : 없음
	public abstract void enQueue(String title);
	
	/* [2]
	 * 메소드명 : deQueue
	 * 매개변수 : 없음
	 * 반환값 : 문자열
	 */
	String deQueue();
	
	/* [3]
	 * 메소드명 : getSize
	 * 매개변수 : 없음
	 * 반환값 : 정수형
	 */
	public int getSize();
}
