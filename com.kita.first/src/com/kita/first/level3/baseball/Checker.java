package com.kita.first.level3.baseball;

public class Checker {
//	스트라이크, 볼, 아웃 개수 확인하는 클래스
	public static boolean check(int LEN, int[] rArr, int[] myArr) {
		int strike = 0;
		int ball = 0;
		
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
//		if(strike == LEN) {
//			return false;
//		}
//		return true;
		return strike != LEN;
	}
}
