package com.kh.inherit;

public class Customer {
	//멤버 변수 : 고객 ID(-), 고객이름(-), 고객등급(-), 포인트, 포인트적립율
	private String id;
	private String name;
	protected String level;
	int point;
	double pointrate;
	
	//생성자 : 멤버 변수를 초기화 하기 위해 사용하는 메소드
	//		 기본 값은 public 클래스명 () {}
	//		 초기화 할 값을 매개 변수로 받아서 초기화할 때
	//		 public Customer(String name){
	//			this.name = name;
	//		 }
	//		 public Customer(String ID, String name){
	//			this.id = id;
	//			this.name = name;
	//		 }
	// 		Customer customer = new Customer("아무개");
	//
	//초기화 : 고객등급("SILVER"), 포인트적립율(0.01) => 초기화
	public Customer(){
		init();
	}
	
	//고객 ID,고객이름을 전달 받아서 초기화하는 메소드 (생성자)
	public Customer(String ID, String name){
		this.id = id;
		this.name = name;
		
		init();
	}
	private void init() {
		level = "SILVER";
		pointrate = 0.01;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드
	//(1) 적립 포인트 계산. 금액을 전달 받아서 포인트적립율을 기준으로 포인트 계산 후 포인트 변수에 저장. 금액 다시 결과로 반환
	//	  메소드명 :calcPrice
	//    매개변수명 : price
	public int calcPrice(int price) {
		point += price * pointrate;
		return price;
	}
	
	//(2) 고객 정보를 결과로 반환
	//    "{고객명}님의 등급은 {고객등급}이고, 보너스 포인트는 {포인트}입니다."
	//    메소드명 : showCustomerInfo
	public String showCustomerInfo() {
		return name + "님의 등급은 " + level + "이고, " + "보너스 포인트는 " + point + "입니다.";
	}

}
