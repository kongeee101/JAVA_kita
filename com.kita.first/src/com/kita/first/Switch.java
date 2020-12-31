package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		int rNum = (int)(Math.random()*6+1);
		String menu;
		switch(rNum) {
		case 1:
			menu = "치킨";
			break;
		case 2: 
			menu = "떡볶이";
			break;
		case 3:
			menu = "소고기";
			break;
		case 4:
			menu = "햄버거";
			break;
		case 5:
			menu = "돈까스";
			break;
		default:
			menu = "초밥";
		}
		System.out.printf("오늘의 메뉴는 %s입니다.", menu);
	}
}
