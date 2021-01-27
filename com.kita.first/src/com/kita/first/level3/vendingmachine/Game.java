package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	private int count = 0;
	private int totalPrice = 0;
	
	int inputNum() {
		System.out.println("메뉴를 입력하세요(0 입력 시 종료): ");
		return scan.nextInt();
	}
	void sumMenuPrice(Menu menu, int num) {
		totalPrice += menu.getMenuPrice(num);
	}
	
	public void setCount() {
		count++;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	
	
	
	
//	void divideNum(int num, int len) {
//		if(num < 0 || num > len) {
//			System.out.println("잘못입력하셨습니다.");
//		}
//	}
//	boolean isContinue(int num) {
//		if(num == 0) {
//			return false;
//		}
//		return true;
//	}
}
