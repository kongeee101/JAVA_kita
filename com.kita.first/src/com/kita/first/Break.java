package com.kita.first;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if(k==1) {
						break;
					}
					System.out.printf("%d, %d, %d\n", i, j, k);
				}
			}
		}
	}
}
