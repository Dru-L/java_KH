package com.kh.object;

public class Car extends Vehicle{ //Vehicle 부모 클래스로부터 상속받음.
	/*
	 * 추상화 과정
	 * [1] 필요한 데이터 나열
	 * 	//차 종류, 차량 번호, 바퀴수, 지붕 유/무, 연비, 기어방식, 차종, 차 색상, 가격
	 *	//움직인다, 경적을 울린다, 멈춘다, 노래를 재생한다
	 * [2] 불피요한 정보 제거
	 * 	// 노래를 재생한다, 바퀴 수
	 * [3] 변수 및 메소드 정의
	 * 	// String number;
	 * 	   boolean isRoof; => 지붕 유무
	 * 	   double fuelEff;
	 *     String gearMethod;
	 *     String kind;
	 *     String color;
	 *     int price;
	 *     String melody = "빵빵";
	 *     boolean isMove;
	 *     
	 *  // 움직인다, 경적을 울린다, 멈춘다, 경적 소리를 설정한다, 주행 상태확인
	 *  public void move() {//움직이고 있다고 출력}
	 *  public void setMelody(String melody){//경적 소리를 설정}
	 *  public void singingBell() {//경적 소리 출력}]
	 *  public void stop() {//멈췄다고 출력}
	 *  public boolean checkMove(){//주행상태 출력 및 주행상태 반환}
	 */
	
	private String number;	//차량번호
	boolean isRoof;			//지붕 유무
	double fuelEff;			//연비
	String gearMethod;		//기어방식
	String kind;			//차종
	String color;			//차 색상
	private int price;		//가격
//	String melody = "빵빵";	//경적 소리
//	boolean isMove;			//주행 상태
	
	//private 캡슐화 필요 => number, price
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	/* 부모 클래스 이용 예정*/
//	public void move() {
//		//주행상태를 움직이고 있다고 출력
//		//주행 중 : true
//		isMove = true;
//	}
//	public void stop() {
//		//멈췄다고 출력
//		isMove = false;
//	}
//	public boolean checkMove(){
//		//주행상태 출력 및 주행상태 반환
//		if (isMove) {
//			System.out.println("주행중 입니다.");
//		}else {
//			System.out.println("멈춘 상태입니다.");
//		}
//		return isMove;
//	}
//	public void setMelody(String melody){
//		//경적 소리를 설정
//		this.melody = melody;
//	}
//	public void singingBell() {
//		//경적 소리 출력
//		System.out.println(melody);
//	}
}
