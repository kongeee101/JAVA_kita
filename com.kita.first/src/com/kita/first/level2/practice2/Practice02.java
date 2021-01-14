package com.kita.first.level2.practice2;

public class Practice02 {
	public static void main(String[] args) {
		int n1 = sum(5, 6);
		int n2 = minus(7, 4);
		int n3 = multiply(n1, n2);
		double n4 = divide(5, 3);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.printf("%.2f", n4);
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	static int multiply(int x, int y) {
		return x*y;
	}
	static double divide(int x, int y) {
		return (double)x/y;
	}
}
