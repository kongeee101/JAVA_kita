package com.kita.first.level2;

public class Phone extends Object{
	// 필드(속성)
	String company;
	String name;
	String color;
	int memory;
	// 생성자(스캐너도 생성자.. 새 인스턴스를 생성)
	Phone() {
		super(); //이 클래스의 부모를 가르킴..object
	} //기본 생성자
	Phone(String company){
		this(company, "아이폰", "검은색", 0);
	}
	Phone(String company, String name){
		this(company, name, "검은색", 0);
	}
	Phone(String company, String name, String color) {
		this(company, name, color, 0);
	}
	Phone(String company, String name, String color, int memory) { // 필드를 초기화
		this.company = company;
		this.name = name;
		this.color = color;
		this.memory = memory;
	} //보라색은 예약어, this는 자신을 가르킴..
	
	//생성자랑 메소드 차이점..?
	//리턴타입X, 클래스와 이름이 같음
	
	// 메소드(동작)
	String sendMsg(String str) {
		String result = str;
		if("".equals(str)) {
			String blank = "";
			result = blank;
		}
		System.out.println(result);
		return result;
	}
	void call() {
		
	}
}


class Computer{
	/*
	 * 한 파일에 클래스 두 개 만들수는 있는데 굳이?
	 * 컴파일러 돌리면 어차피 클래스 두 개로 나눠져서 저장됨
	 * 심지어 public(접근제한자)도 못 붙임
	 */
}