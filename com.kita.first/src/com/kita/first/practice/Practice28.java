package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{90, 100, 88},
				{34, 99, 45},
				{89, 65, 74}
		};
		
		String[] clsArr = {"국어", "수학", "영어"};
		int[] sumArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sumArr[i] += arr[i][j];
			}
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
		}
		int totalSum = 0, totalCnt = 0;
		for(int i = 0; i < arr.length; i++) {
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
		}
		System.out.printf("전체합계: %d, 평균: %.1f", totalSum, (float)totalSum/totalCnt);
	}
}
