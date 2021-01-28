package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall {
//	내가 숫자값 입력하고 예외처리하는 클래스
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int LEN) {
		myArr = new int[LEN];
		scan = new Scanner(System.in);
	}
	
	void inputNum(int LEN) {
		int min = 0;
		int max = 9;
		
		for(int i = 0; i < LEN; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i+1);
			myArr[i] = scan.nextInt();
				
			if(myArr[i] < min || myArr[i] > max) {
				System.out.println("잘못입력하셨습니다.");
				i--;
				continue;
			}
			for(int j = 0; j < i; j++) {
				if(myArr[i] == myArr[j]) {
					System.out.println("같은 숫자를 입력하셨습니다.");
					i--;
					break;
				}
			}
		}
	}
	//getter setter
	public void setMyArr(int[] myArr) {
		this.myArr = myArr;
	}
	public int[] getMyArr() {
		return myArr;
	}
}
