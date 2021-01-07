package com.kita.first.practice;

public class Practice22 {
	public static void main(String[] args) {
		int[] arr1 = new int [100];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1);
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
			if (i != arr1.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
