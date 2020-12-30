package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String odd;
		
		if (num % 2 == 1) {
			odd = "홀수";
		}
		else {
			odd = "짝수";
		}
		System.out.printf("%s입니다.", odd);
		
		scan.close();
	}
}
