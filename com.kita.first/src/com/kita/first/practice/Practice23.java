package com.kita.first.practice;

public class Practice23 {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		int temp;
		//오름차순
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		//내림차순
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
