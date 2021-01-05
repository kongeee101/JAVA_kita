package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //ctrl+shift+o
		String menu;
		boolean again = true;
		do {
			int rNum = (int)(Math.random()*6+1);
			if (rNum == 1) {
				menu = "치킨";
			}
			else if (rNum == 2) {
				menu = "떡볶이";
			}
			else if (rNum == 3) {
				menu = "소고기";
			}
			else if (rNum == 4) {
				menu = "햄버거";
			}
			else if (rNum == 5) {
				menu = "돈까스";
			}
			else {
				menu = "초밥";
			}
			System.out.println("뽑힌 메뉴 : " + menu);
			System.out.print("마음에 듭니까?(Y/N)");
			String answer = scan.next();
			if("Y".equals(answer)) {
				break;
			}
		} while(again);
		System.out.printf("오늘의 메뉴는 %s입니다.", menu);
		scan.close();
	}
}
