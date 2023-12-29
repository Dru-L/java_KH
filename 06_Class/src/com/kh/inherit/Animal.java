package com.kh.inherit;

//부모 클래스
public class Animal {
	/*
	 * 추상화 과정
	 * [1] 식성(육식/잡식/초식), 털 유/무, 보행타입(이족/사족/??), 울음소리, 색상, 위험성, 서식지
	 * 		운다. 먹는다. 싼다. 잔다. 걷는다. 죽인다. 찢는다.
	 * [2] 털 유/무, 찢는다. 죽인다. 싼다. 서식지, 보행타입.
	 * [3] 변수와 메소드 정의
	 */
	
	String eatType; //식성(육식/잡식/초식)
	String crySound; //울음소리
	String color; //색상
	boolean isDanger; //위험성 (T : 위험하다, F:안전하다)
	
	//운다, 먹는다, 잔다, 걷는다
	//메소드 정의
	/*
	 * 접근제한자 [예약어] 반환형 메소드명 (매개변수,...){
	 * }
	 */
	//[1]울음소리를 전달받아서 울음소리를 저장 기능 => 운다 (전달받은 값은 멤버 변수에 저장)
	//전달 받은 값이 없을 경우 (빈 값) 기본값으로 "T_T" 출력
	public void setCrySound(String crySound) {
		if (crySound == null || crySound.isEmpty()) {
			this.crySound ="T_T";
		}else {
			this.crySound = crySound;
		}
	}
	
	//[1]울음소리를 출력
	public void showCrySound() {
		System.out.println(this.crySound);
	}
	
	//[2]먹은 음식(무엇이든) 전달받아서 "{전달 받은 음식}" 먹었습니다." 라고 출력
	public void eatFood(String food) {
		System.out.println(food +" 먹었습니다.");
	}
	
	//[3]위험 여부를 결과로 돌려주는 기능
	public String showDanger() {
		return(isDanger)? "위험" : "안전";
	}
}
