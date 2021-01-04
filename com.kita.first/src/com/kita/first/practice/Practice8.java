package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		System.out.print("몇 월인지 입력해주세요.(1~12) ");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		String season = "가을";
	
		switch(month) {
		case "12":
		case "1":
		case "2":
			season = "겨울";
			break;
		case "3":
		case "4":
		case "5":
			season = "봄";
			break;
		case "6":
		case "7":
		case "8":
			season = "여름";
			break;
		default:
			season = "가을";
		}
		System.out.printf("%s월은 %s입니다.", month, season);
		
//		int monthNum = Integer.parseInt(month);
//		if (monthNum >= 1 && monthNum <= 2 || monthNum == 12) {
//			season = "겨울";
//		}
//		else if(monthNum >= 3 && monthNum <= 5) {
//			season = "봄";
//		}
//		else if(monthNum >= 6 && monthNum <= 8) {
//			season = "여름";
//		}
//		System.out.printf("%s월은 %s입니다.", month, season);
		scan.close();
	}
}
