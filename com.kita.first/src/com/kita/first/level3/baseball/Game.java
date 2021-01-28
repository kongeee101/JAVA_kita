package com.kita.first.level3.baseball;

public class Game {
//	실제 게임 실행하는 클래스
	public static void main(String[] args) {
		int LEN = 3;
		int count = 0;
		
		Baseball baseball = new Baseball(LEN);
		MyBall myball = new MyBall(LEN);
		
		System.out.println("숫자야구게임 시작!");
		do {
			myball.inputNum(LEN);
			count++;
			System.out.println(count + "번 완료");
		} while(Checker.check(LEN, baseball.getrArr(), myball.getMyArr()));
		System.out.println("End!");
	}
}
