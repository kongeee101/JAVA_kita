package com.kita.first.practice;

public class Practice24_1 {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		int temp;
		//버블정렬
		for(int i = arr.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
//		for(int i = 1; i < arr.length; i++) {
//			for(int j = 0; j < arr.length-1; z++) {
//				if(arr[j] > arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//			}
//		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
