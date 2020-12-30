package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("수학 응시 유형을 입력해 주세요: ");
		String math = scan.next();
		String str = "평균";
		
		if ("가".equals(math)) {
			System.out.printf("점수를 입력해주세요: ");
			int score = scan.nextInt();
			if (score > 60) {
				str = "평균 초과";
			}
			else if (score < 60) {
				str = "평균 미만";
			}
			System.out.printf("%s입니다.", str);
		}
		else if("나".equals(math)) {
			System.out.printf("점수를 입력해주세요: ");
			int score = scan.nextInt();
			if (score > 70) {
				str = "평균 초과";
			}
			else if (score < 70) {
				str = "평균 미만";
			}
			System.out.printf("%s입니다.", str);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		/*
		 * int defaltScore = 70;
		 * 이렇게 해서 if문 하나로 만들어서 하는거...
		 * 하...
		 */
		
		scan.close();
	}
}
