package com.kita.first.level2;

import java.util.Scanner;

public class Calc {
	// 필드
//	static int n1 = 1;
//	final int N2 = 3;
	// 생성자
	
	// 메소드
	public static void main(String[] args) {
		Calc myCalc1 = new Calc();
//		Calc myCalc2 = new Calc();
//		Calc myCalc3 = new Calc();
		myCalc1.powerOn();
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int num1 = myCalc1.sum(n1, n2);
		int num2 = myCalc1.minus(n1, n2);
		int num3 = myCalc1.multiply(n1, n2);
		double num4 = myCalc1.divide(n1, n2);
		int num5 = myCalc1.sum(n1, n2, 3);
		
		System.out.println("합 "+num1);
		System.out.println("차 "+num2);
		System.out.println("곱 "+num3);
		System.out.printf("나 %.1f\n", num4);
		
		myCalc1.powerOff();
	}
	
	public void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	public void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	// 오버로딩 (매개변수의 차이가 있을 때 같은 이름의 메소드 가능)
	public int sum(int n1, int n2, int n3) {
		int result = n1 + n2 + n2;
		return result;
	}
	public int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public int multiply(int n1, int n2) {
		return n1 * n2;
	}
	public double divide(int n1, int n2) {
		return (double)n1 / n2;
	}
}