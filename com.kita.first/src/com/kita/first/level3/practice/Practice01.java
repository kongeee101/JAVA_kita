package com.kita.first.level3.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자만 입력하시오 : ");
		String result = scan.next();
		//int result2 = scan.nextInt();
		
		int num;
		try {
			num = Integer.parseInt(result);
		} catch(Exception e) {
			num = 0;
			System.out.println("변환 실패");
		}
		System.out.println("num : "+num);
		
		scan.close();
	}
}
