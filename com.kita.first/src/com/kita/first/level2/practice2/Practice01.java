package com.kita.first.level2.practice2;


public class Practice01 {
	public static void main(String[] args) {
		Practice01 myGugudan = new Practice01();
		for(int i = 2; i < 10; i++) {
			myGugudan.printGugudan(i);
			System.out.println();
		}
	}
	
	void printGugudan(int num){
		// 구구단 출력
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
}
