package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		System.out.print("점수를 입력해주세요: (0~100) ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = "D";
		String plus = " ";
		if (score <= 100) {
			if (score >= 90) {
				grade = "A";
			}
			else if (score >= 80) {
				grade = "B";
			}
			else if (score >= 70) {
				grade = "C";
			}
			if ("A".equals(grade)||"B".equals(grade)||"C".equals(grade)) {
				if ((score%10)>=7||score==100) {
					plus = "+";
				}
				else if ((score%10)<=3) {
					plus = "-";
				}
			}
			System.out.printf("%d점 : %s%s", score, grade, plus);
		}
		else {
			System.out.print("잘못 입력하였습니다.");
			//return : 메소드를 종료
		}
		scan.close();
	}
}
