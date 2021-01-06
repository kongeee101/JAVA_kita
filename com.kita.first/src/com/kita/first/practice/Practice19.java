package com.kita.first.practice;

import java.util.Scanner;

public class Practice19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요(0 입력 시 종료) ");
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.print("합계: "+sum);
		scan.close();
	}
}
