package com.kita.first.level2;

public class PhoneTest {
	public static void main(String[] args) {
		Phone myPhone = new Phone("iPhone 12 pro", "실버", 128);
		Phone yourPhone = new Phone("iPhone 12", "노란색", 256);
		System.out.println(myPhone.name);
		System.out.println(yourPhone.name);
		
		Phone phone1 = new Phone();
		System.out.println(phone1.name);
		Phone phone2 = new Phone("iPhone 11");
		System.out.println(phone2.name);
		System.out.println(phone2.color);
		System.out.println(phone2.memory);
	}
}
