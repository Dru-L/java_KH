package com.kh.run;

// import com.kh.operator.LogicalNegation; //해당 패키지 안에 있는 class를 사용하겠다.
import com.kh.operator.*;
/*
 * 연산자 : 프로그램이 실행될 때 연산을 도와주는 것들
 * - 우선순위, 연산 방향 중요
 * 1) 직접 접근 연산자 : . [] () {}
 * 2) 단항 연산자 : 부호 연산자 ( +, - ), !(부정), 증감연산자 (++ --), (자료형)=>형변환
 * 3) 산술 연산자 : + - * / %
 * 4) 쉬프트 연산자 : >> << >>>
 * 5) 비교 연산자 : > < >= <= == !=
 * 6) 논리 연산자 : && || & ^ |
 * 7) 삼항 연산자 : (조건식) ? (조건이 참인 경우 사용할 값) : (조건이 거짓일 경우 사용할 값)
 * 8) 대입 연산자 : = += -= += /= %= <<= >>= >>>= &= ^= !=
 * 9) 나열 연산자 : , (a, b, c)
 */
public class OperatorRun {
	public static void main(String[] args) {
		
		 LogicalNegation ln = new LogicalNegation(); //(클래스) (명칭) = new (클래스)();
		 //ln.method(); //(명칭).(실행할 void 이름)();
	
		InDecrease id = new InDecrease();
		//id.method1();
		//id.method2();
		//id.method3();
		
		Arithmetic ar = new Arithmetic();
		//ar.method1();
		//ar.method2();
		
		Comparison cp = new Comparison();
		//cp.method();
		
		Logical lg = new Logical();
		//lg.method1();
		//lg.method2();
		//lg.method3();
		
		Triple tr = new Triple();
		//tr.method1();
		tr.method2();
	}
}
