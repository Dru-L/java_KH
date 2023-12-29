package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class C_Function {
	/*
	 * Function
	 * 	- Function 함수적 인터페이스는 매개값과 리턴값이 있는 apply() 추상 메소드를 가지고 있다.
	 * 	- apply() 추상 메소드는 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다.
	 */
	
	public void method1() {
		Student student;
		
		student = new Student("홍길동", 20, "남자", 80, 70);  //오버로딩
		
		System.out.println(student);
		
//		Function<T, R> //T에서 변환할 R타입 지정 (타입 변환)
		Function<Student, String> function;//Student를 String 타입으로 변환하겠다.
		
//		function = (Student s) -> {
//			return s.getName();
//		};
//		function = (Student s) -> s.getName();
		function = Student::getName;
		
		System.out.println(function.apply(student));
		
		
//		BiFunction<T, U, R> //T: 타입, U,R:매개값2개
		BiFunction<String, Integer, Student> biFunction;
//		biFunction = (String name, Integer age) -> {
//			return new Student(name, age);
//		};
//		biFunction = (name, age) -> new Student(name, age); //축약
		biFunction = Student::new; //축약2
		
		System.out.println(biFunction.apply("이몽룡", 25));
		
		
//		DoubleFunction<R>//R : 리턴타입
//		DoubleFunction<User>
//		DoubleToIntFunction // double 타입을 int타입으로 변환하겠다.
		
	}
}
