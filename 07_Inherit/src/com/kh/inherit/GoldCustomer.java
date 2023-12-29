package com.kh.inherit;

public class GoldCustomer extends Customer {
	//Customer 클래스로부터 상속을 받고
	
	double saleRatio;
	//고객등급 : "GOLD", 적립율 : 0.02. 할인율 : 0.1 초기화
	public GoldCustomer(String id, String name){
		super(id, name); //부모클래스의 생성자 호출
		level = "GOLD";
		pointrate = 0.02;
		saleRatio = 0.1;
	}
	//할인율을 계산해서 결과로 돌려주는 기능
	//(적립금도 계산)
	//메소드명 : calcPrice
	//오버라이딩 : 부모클래스이 메소드를 재정의
	@Override
	public int calcPrice(int price) {
		point += price * pointrate;
		return price -= price * saleRatio;
	}
	
}
