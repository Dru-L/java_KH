package com.kh.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D_Mapping {
	/*
	 * 매핑
	 * 	- 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
	 * 		- map()
	 * 			- 스트림의 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다.
	 * 		- flatMap()
	 * 			- 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성한다.
	 * 		- asDoubleStream()
	 * 			- IntStream, LongStream을 DoubleStream으로 변환한다.
	 * 		- asLongStream()
	 * 			- IntStream을 LongStream으로 변환한다.
	 * 		- boxed()
	 * 			- int, long, double 요소를 Integer, Long, Double 타입의 요소로 박싱해서 스트림을 생성한다.
	 */
	
	public void method1() {
		List<Student> students = Arrays.asList(
			new Student("홍길동", 20, "남자", 80, 70),
			new Student("이몽룡", 20, "남자", 50, 60),
			new Student("성춘향", 20, "여자", 90, 80)
		);
		
//		students.stream()
//				.map((Student student) ->{
//					return student.getName();
//				})
//				.forEach(name -> System.out.println(name));
		students.stream()
//			.map(student -> student.getName())
			.map(Student::getName)
//			.forEach(name -> System.out.println(name));
			.forEach(System.out::println);
		
		double avg = students.stream()
//							.mapToInt(student-> student.getMathScore())
							.mapToInt(Student::getMathScore)
							.average()
							.getAsDouble();
		
		System.out.println("수학 점수의 평균은 " + avg);
	}
	
	
	//flatMap() : 문자열을 쪼개서 새로운 문자열 출력
	public void method2() {
		List<String> list = Arrays.asList(
			"Hello World",
			"Java11 Lambda",
			"StreamAPI Mapping"
		);
		
		list.stream()
			.forEach(str -> System.out.println(str));
		
		System.out.println();
		
//		list.stream()
//	        .flatMap((String str) -> {
////	           String[] array = str.split(" ");
////	           return Arrays.stream(array);
//	           return Arrays.stream(str.split(" ")); //위의 2줄을 한줄로 축약
//	        })
//	        .forEach(str -> System.out.println(str));
		// 좀더 축약~
		list.stream()
        .flatMap( str -> Arrays.stream(str.split(" ")) )
        .forEach(str -> System.out.println(str));
	}
	
	// asDoubleStream(), asLongStream(), boxed()
	public void method3() {
		int[] array1 = {1,2,3,4,5};
		double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Arrays.stream(array1)
//			  .asDoubleStream()
			  .asLongStream()
			  .asDoubleStream()
			  .forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		
		// 내림차순
		Arrays.stream(array2)
			  .boxed()
			  .sorted(Comparator.reverseOrder())
//			  .mapToDouble(value -> value.doubleValue())
			  .mapToDouble(Double::doubleValue)
			  .forEach(value -> System.out.print(value + " "));
	}
}
