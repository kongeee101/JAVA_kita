package com.kita.first;

public class Variable1 {
	public static void main(String[] args) {
		char v1;
		v1 = 'A';
		
		byte v2;
		short v3;
		int v4;
		long v5;
		
		float v6 = 10.1f; //f붙여야함
		double v7 = 10.1;
		
		boolean v8;
		v8 = true;
		v8 = false;
		
		int num1 = 5;
		System.out.println(num1);
		num1 = 8;
		System.out.println(num1);
		
		final int NUM2 = 6; //상수(매크로상수)
		System.out.println(NUM2);
		//NUM2 = 7;
		
		String v9 = "안녕하세요."; //참조변수,레퍼런스변수
		System.out.println(v9);
		
		Variable1 v;
	}
}
