package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

import com.kita.first.level3.Utils;

public class Menu {
	//필드
	private String[] menuArr;
	private int[] priceArr;
	
	//생성자
	public Menu(int len) {
		menuArr = new String [len];
		priceArr = new int [len];
	}
	
	//메소드 setter&getter
	public void setMenuItem(int index, String item) {
		menuArr[index] = item;
	}
	public void setMenuPrice(int index, int price) {
		priceArr[index] = price;
	}
	
	public String getMenuItem(int index) {
		return menuArr[index];
	}
	public int getMenuPrice(int index) {
		return priceArr[index];
	}
	
	//메소드 값 입력
	public void inputArrItem(){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < menuArr.length; i++) {
			System.out.printf("%d번째 값 입력 : ", i+1);
			String str = scan.next();
			menuArr[i] = str;
		}
		scan.close();
	}
	public void inputArrPrice(){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < priceArr.length; i++) {
			System.out.printf("%d번째 값 입력 : ", i+1);
			String str = scan.next(); //int num = scan.nextInt();
			int num = Utils.parseStrToInt(str);
			if(num == 0) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				i--;
				continue;
			}
			priceArr[i] = num;
		}
		scan.close();
	}
}
