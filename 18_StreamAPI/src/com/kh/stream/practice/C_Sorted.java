package com.kh.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C_Sorted {
	/*
	 * 정렬
	 *   - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 
	 *     정렬해서 최종 처리 순서를 변경할 수 있다.
	 *   - IntStream, LongStream, DoubleStream은 요소들을 
	 *     오름차순으로 정렬한다.
	 *   - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야
	 *     정렬할 수 있다. (구현하지 않으면 예외가 발생한다.)
	 */
	
	/**
	 * 
	 */
	public void method1() {
		List<Student> students = Arrays.asList(
			new Student("홍길동", 25),
			new Student("이몽룡", 20),
			new Student("성춘향", 23, "여자", 80, 80)
		);
		
//		students.stream()
//				.sorted()
//				.forEach((Student student)->{
//					System.out.println(student);
//				});
		students.stream()
//		.sorted() //오름차순
//		.sorted( ((s1, s2) -> s2.getAge() - s1.getAge()) )//내림차순(재정의하지 않았거나, 다른 기준으로 재정의 해야할때)
		.sorted( ((s1, s2) -> s1.getAge() - s2.getAge()) )//오름차순(재정의하지 않았거나, 다른 기준으로 재정의 해야할때)
//		.sorted(Comparator.naturalOrder()) // 오름차순 (반드시 재정의 되어야함)
//		.sorted(Comparator.reverseOrder()) // 내림차순 (반드시 재정의 되어야함)
		.forEach(System.out::println);
	}
	
	public void method2() {
//		int[] array;
//		array = new int[]{3,5,1,4,2};
		int[] array = {3,5,1,4,2};
		
		//오름차순으로 정렬. 기본적으로 배열은 오름차순만 만들어준다.
		Arrays.stream(array)
			  .sorted()
			  .forEach(value -> System.out.println(value + ""));
		
		//내림차순으로 정렬. 내림차순을 하기위해서는 wrapper 클래스로 감싸야한다.
		Arrays.stream(array)
		  	  .boxed() //wrapper 클래스로 감싸기.
		  	  .sorted(Comparator.reverseOrder())
		  	  .forEach(value -> System.out.println(value + ""));
//		박싱 : 기본타입 > 객체로 감싸줘
//		언박싱 : 객체로 감싼거 > 기본타입으로 바꿔줘
	}
	
	
}
