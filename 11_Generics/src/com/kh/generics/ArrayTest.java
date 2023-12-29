package com.kh.generics;

//제네릭 클래스 : 타입 매개변수 1개
class MyArray<E>{	//모든 타입을 허용(사용), 데이터 타입: E
	private Object[] array = new Object[10];
	int i;
	
	//[1]배열에 추가(add), E 타입의 매개변수를 받아 i번째에 대입하고, i 값을 증가하는 메소드
	public void add(E e) {	//E는 어떤 타입인지는 모르나, MyArray클래스가 생성될 때 정해짐.
		this.array[i] = e;  //array 배열에 i번째 위치에 매개변수로 받은 e 데이터를 대입
		i++;				//대입 후에 i 값 증가
		//array[i++] = e;
	}
	
	//[2] 인덱스를 매개변수로 받아서, 배열(array)에서 인덱스 위치의 데이터 결과 값으로 반환하는 메소드
	//인덱스 : 위치를 의미. 0부터 시작. 정수형.
	public E get(int idx) {//Object타입의 데이터를 반환
		//int(정수형)idx 매개변수를 받는 get메소드
		//배열에서 idx위치의 데이터를 결과로 반환
		return (E)array[idx]; //형변환해서 Object의 자식클래스들이 다 배열을 받을 수 있도록한다.
	}
}

public class ArrayTest {
	public static void main(String[] args) {
		//** MyArray<E> **
		//ArrayList<String> a = new ArrayList<String>()
		
		MyArray<String> ma1 = new MyArray<String>();
		//String : 클래스
		//	클래스를 매개변수로 한다는건, 호출할 때(인자값으로 전달할때) 인스턴스화하여 전달.
		ma1.add(new String("Hi")); //new 자료형(넣을 값);
		String data1 = ma1.get(0);
		System.out.println(data1);
		
		MyArray<Integer> m2 = new MyArray<Integer>();
		m2.add(new Integer(20));
		Integer data2 = m2.get(0);
		System.out.println(data2);
	}
}
