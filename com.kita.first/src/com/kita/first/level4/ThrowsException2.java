package com.kita.first.level4;

public class ThrowsException2 {
	void method1() {
		//ThrowsException, trycatch로 예외처리
		ThrowsException te = new ThrowsException();
		try {
			te.parseStrToInt();
		} catch(NumberFormatException e) {
			System.out.println("문자가 섞였습니다. 다시 입력해주세요.");
		} catch(NullPointerException e) {
			System.out.println("주소값이 연결되어 있지 않습니다.");
		} catch(Exception e) {
			System.out.println("잘못 입력했습니다.");
		}
	}
}
