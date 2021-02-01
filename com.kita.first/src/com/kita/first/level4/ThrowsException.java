package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	//예외처리를 다른 클래스에서 받았을때 하게만듦
	//주로 메인메소드에서  trycatch
	Scanner scan = new Scanner(System.in);
	
	void parseStrToInt() throws Exception {
		System.out.print("숫자를 입력해주세요: ");
		String str = scan.next();
		int num;
		num = Integer.parseInt(str);
		
//		try {
//			num = Integer.parseInt(str);
//		} catch(NullPointerException e) {
//			System.out.println("주소값이 연결되어 있지 않습니다.");
//			num = 0;
//		} catch(Exception e){
//			System.out.println("잘못 입력했습니다.");
//			num = 0;
//		} finally {
//			
//		}
	}
}
