package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int len = 6;
		Menu menu = new Menu(len);
		
		String[] menuArr = { "콜라", "사이다", "캔커피", "데자와", "환타", "웰치스" };
		int[] priceArr = { 900, 700, 400, 500, 600, 1000 };
		Scanner scan = new Scanner(System.in);
		int total = 0;
		
		System.out.println("--메뉴--");
		for(int i = 0; i < menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		
		while(true) {
			System.out.print("메뉴를 입력하세요(0 입력 시 종료): ");
			int num = scan.nextInt();
			
			if(num == 0) {
				break;
			}
			else if(num > 6 || num < 0) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			
			total += priceArr[num-1];
			
			System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
		}
		System.out.printf("합계 : %d원", total);
		scan.close();
	}
}
