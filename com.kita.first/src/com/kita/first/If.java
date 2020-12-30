package com.kita.first;

public class If {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 2;
		
		//boolean isOdd = (n1 % 2 == 1) ? true : false;
		
		String oddNum = "짝수";
		
		if (n1 % 2 == 1) {
			oddNum = "홀수";
		}
		//else {
		//	oddNum = "짝수";
		//}
		System.out.printf("%d는 %s입니다.\n", n1, oddNum);
		
		if (n1 > n2) {
			System.out.printf("n1이 n2보다 크다.");
		}
		else if (n1 == n2) {
			System.out.printf("n1과 n2가 같다.");
		}
		else {
			System.out.printf("n1이 n2보다 작다.");
		}
	 }
}
