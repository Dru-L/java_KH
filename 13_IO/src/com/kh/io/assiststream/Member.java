package com.kh.io.assiststream;

import java.io.Serializable;

public class Member implements Serializable{ //직렬로 모든 데이터를 한줄로 구현
	
	private static final long serialVersionUID = 8474050835386121281L;
	// 모든 Class는 UID를 가지고 있는데 Class의 내용이 변경되면 UID값 역시 같이 바뀌어 버립니다.
	// 직렬화하여 통신하고 UID값으로 통신한게 정상인지 확인하는데 그 값이 바뀌게 되면 다른 Class로 인식을 해버리게 됩니다.
	// 이를 방지하기 위해 고유값으로 미리 명시를 해주는 부분 

	private String id;
	
	private transient String password; //transient : 파일을 기본 초기값으로 넘겨줌
	
	private String name;
	
	private int age;
	
	private char gender;
	
	private transient double point;
	
	public Member() {
	}

	public Member(String id, String password, String name, int age, char gender, double point) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", point=" + point + "]";
	}
	
	
	
}
