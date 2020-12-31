package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		System.out.print("몇 월인지 입력해주세요.(1~12) ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		default:
			season = "가을";
		}
		System.out.printf("%d월은 %s입니다.", month, season);
		scan.close();
	}
}
