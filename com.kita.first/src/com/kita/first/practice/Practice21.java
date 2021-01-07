package com.kita.first.practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 90, min = 10;
		int num = (int)(Math.random()*(max-min+1)+min);
		
		System.out.println(num);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			
			int sc = scan.nextInt();
			
			if(sc > max || sc < min) {
				System.out.println("잘못 입력하셨습니다.");
			}
			else if(sc > num) {
				System.out.println("Down");
//				if(sc > max) {
//					System.out.printf("%d보다 작은 수를 입력하세요.\n", max);
//				}
			}
			else if(sc < num) {
				System.out.println("Up");
//				if(sc < min) {
//					System.out.printf("%d보다 큰 수를 입력하세요.\n", min);
//				}
			}
			else {
				System.out.println("Great!");
				break;
			}
		}
		scan.close();
	}
}
