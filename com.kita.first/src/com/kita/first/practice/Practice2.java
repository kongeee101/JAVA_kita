package com.kita.first.practice;

public class Practice2 {
	public static void main(String[] args) {
		/*
		 * name
		 * age
		 * vision
		 * bloodType
		 */
		String name = "김보경";
		int age = 20;
		double vision = 0.1;
		char bloodType = 'O';
		
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.println("시력은 " + vision + "이고 혈액형은 " + bloodType + "형입니다.");
		
		System.out.printf("제 이름은 %s이고 나이는 %d살입니다.\n", name, age);
		System.out.printf("시력은 %.1f이고 혈액형은 %c형입니다.\n", vision, bloodType);
	}
}
