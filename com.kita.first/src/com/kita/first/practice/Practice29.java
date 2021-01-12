package com.kita.first.practice;

import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int LEN = 3;
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		int max = 9;
		int min = 1;
		
		for(int i = 0; i < LEN; i++) {
			rArr[i] = (int)(Math.random()*(max-min+1)+min);
			for(int j = 0; j < i; j++) {
				if(rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		for(int num : rArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("숫자야구게임 시작!");
		while(true) {
			int strike = 0;
			int ball = 0;
			for(int i = 0; i < LEN; i++) {
				System.out.printf("%d번째 숫자 입력 : ", i+1);
				myArr[i] = scan.nextInt();
				
				if(myArr[i] < min || myArr[i] > max) {
					System.out.println("잘못입력하셨습니다.");
					i--;
					continue;
				}
				for(int j = 0; j < i; j++) {
					if(myArr[i] == myArr[j]) {
						System.out.println("같은 숫자를 입력하셨습니다.");
						i--;
						break;
					}
				}
			}
			for(int i = 0; i < LEN; i++) {
				for(int j = 0; j < LEN; j++) {
					if(myArr[i] == rArr[i]) {
						strike++;
						break;
					}
					else if(myArr[i] == rArr[j]) {
						ball++;
					}
				}
			}
			System.out.printf("S : %d / B : %d / O : %d\n", strike, ball, LEN-strike-ball);
			if(strike == LEN) {
				break;
			}
		}
		scan.close();
		System.out.print("End!");
	}
}
