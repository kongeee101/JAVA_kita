package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	//예외처리를 다른 클래스에서 받았을때 하게만듦
	//주로 메인메소드에서  trycatch
	Scanner scan = new Scanner(System.in);
	
	void method1() throws Exception {
//		try {
//			
//		} catch(NullPointerException e) {
//			
//		} catch(Exception e){
//			
//		} finally {
//			
//		}
		
		int num = Integer.parseInt(scan.next());
	}
}
