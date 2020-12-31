package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		String menu;
		switch(sNum) {
		case "일":
			menu = "치킨";
			break;
		case "이": 
			menu = "떡볶이";
			break;
		case "삼":
			menu = "소고기";
			break;
		case "사":
			menu = "햄버거";
			break;
		case "오":
			menu = "돈까스";
			break;
		default:
			menu = "초밥";
		}
		System.out.printf("오늘의 메뉴는 %s입니다.", menu);
		scan.close();
	}
}
