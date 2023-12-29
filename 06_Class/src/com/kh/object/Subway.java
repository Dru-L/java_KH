package com.kh.object;

public class Subway {
	/*
	 * 추상화 과정
	 * [1] 필요한 데이터 나열
	 * [2] 불피요한 정보 제거
	 * [3] 변수 및 메소드 정의
	 */
	
	//몇 호선, 금액, 탑승객의 수, 노선 정보
	//현재 어떤역인지 안내, 금액 안내, 승객이 몇명 타고있는지 안내
	
	private int number;
	private int price;
	static int passengers = 1;
	String subInfo;
	String subWhere;
	int addpassenger;
	int exitpassenger;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void subWhere() {
		System.out.println(number + "호선은 현재 " + subWhere +"역에 있습니다.");
	}
	
}
