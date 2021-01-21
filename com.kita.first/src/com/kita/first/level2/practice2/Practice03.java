package com.kita.first.level2.practice2;

public class Practice03 {
	private String name;
	private int age;
	
	Practice03(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	//마우스 우클릭 - 소스 - generate getters and setters
}
