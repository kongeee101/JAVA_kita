package com.kita.first.practice;

public class Practice27 {
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		int n = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n; // (i*3)+(j+1)
				n++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
