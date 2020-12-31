package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		int rNum = (int)(Math.random()*6+1);
		if (rNum == 1) {
			System.out.println("치킨");
		}
		else if (rNum == 2) {
			System.out.println("떡볶이");
		}
		else if (rNum == 3) {
			System.out.println("소고기");
		}
		else if (rNum == 4) {
			System.out.println("햄버거");
		}
		else if (rNum == 5) {
			System.out.println("돈까스");
		}
		else {
			System.out.println("초밥");
		}
	}
}
