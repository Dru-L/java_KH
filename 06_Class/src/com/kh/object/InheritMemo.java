package com.kh.object;

public class InheritMemo {
	/*
	 * 상속 : "부모 클래스의 멤버(변수, 메소드) 를 자식클래스가 모두 가질 수 있다."
	 * 		 자식 클래스가 부모 클래스에게 상속받으면,
	 * 		 자식 클래스는 부모 클래스의 멤버 변수와 메소드를 사용할 수 있음.
	 * 
	 * [특징]
	 * - 모든 클래스는 "Object" 클래스의 자식 클래스
	 * - 부모 클래스의 "생성자", "초기화블록"는 상속되지 않음!
	 * 	 : 자식 클래스 생성 시 부모 클래스의 생성자가 먼저 호출됨.
	 * - 부모 클래스의 private 멤버는 상속은 되지만 직접 접근 불가.
	 * 	 : 자식 클래스에서만 사용하고자 할 때, protected로 생성
	 * - 단일 상속만 지원 : 자식 클래스는 하나의 부모 클래스로 상속받을 수 있음.
	 * 
	 * [사용법] : extends 키워드 사용
	 * * B 클래스가 A 클래스로부터 상속을 받는다면?
	 * 	 class B extends A {}
	 * 
	 * [부모 클래스 접근방법]
	 * - 부모 클래스 생성자 호출 : super()
	 * - 부모 클래스 변수 및 메소드 접근 : super.
	 *   => 부모 클래스의 멤버 변수와 자식 클래스의 멤버 변수의 이름이 동일할 때 구분하기 위해 사용
	 * 
	 * [클래스 간 형 변환]
	 * : 모든 자식 클래스는 부모 클래스로 형 변환될 수 있지만, 부모 클래스를 자식 클래스로 변환할 수 없다.
	 * 
	 * 	 일반적인 클래스 생성 : Animal animal = new Animal();
	 *   클래스 간 형 변환 : Animal aniPanda = new Panda();
	 *   
	 *   부모클래스 참조변수 = new 자식클래스();
	 *   => 참조변수는 접근 할 수 있는 범위는 부모클래스의 멤버(변수, 메소드)까지.
	 *   
	 * [오버라이딩]
	 * : 자식 클래스가 부모 클래스의 메소드 내용을 다시 정의하는 것
	 * 
	 * @Override 애노테이션 : 재정의된 메소드임을 컴파일러에 명확히 알려주는 역할
	 * 
	 * 여기서, 클래스 형 변환을 적용하면 "인스턴스의 메소드"가 호출됨.
	 * 							=> 자식클래스에 재정의된 메소드가 호출됨
	 * '가상 메소드(virtual method)' : 인스턴스의 메소드가 호출되는 기술
	 * (자세한 내용은 교재 p.254 참고)
	 * 
	 * [다형성]
	 * : 같은 코드에서 여러 실행 결과가 나오는 것.
	 * 	 공통적인 부분은 부모 클래스에서 정의하고, 자식클래스는 필요에 따라 추가요소만 정의
	 *   
	 *   생성된 인스턴스에 따라 재정의된 메소드가 있으면 해당 메소드가 실행됨
	 *   따라서, 실행 결과가 달라질 수 있음.
	 *   
	 *   => 확장성 있고, 유지보수 하기 좋은 프로그램
	 *   
	 * [다운 캐스팅]
	 * : 부모 클래스로 형 변환되었던 자식 클래스를 다시 원래 클래스 형 변환하는 것
	 *	
	 * * instanceof : 다운캐스팅 전 원래 클래스를 확인하는 예약어 (키워드)
	 * 사용방법 => if (참조변변수명 instanceof 원래클래스명)
	 * ex) Vihicle chCar = new Car();
	 * 	   if(vhCar instanceof Car){
	 * 			Car car = (Car)vhCar
	 * 		}
	 * * 다운 캐스팅 하는 이유? 부모 클래스로 형 변환 시 기존에 자식 클래스에 추가되었던 멤버(변수, 메소드)를 사용할 수 없으므로
	 * 					  필요에 따라 다운캐스팅을 통해 자식 클래스의 멤버를 사용하기 위해
	 */
}
