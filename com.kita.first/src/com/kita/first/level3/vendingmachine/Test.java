package com.kita.first.level3.vendingmachine;

public class Test {
	public static void main(String[] args) {
//		String[] menuArr = { "콜라", "사이다", "캔커피", "데자와", "환타", "웰치스" };
//		int[] priceArr = { 900, 700, 400, 500, 600, 1000 };
		
		int len = 6;
		Menu menu = new Menu(len);
		PrintV pv = new PrintV();
		
		menu.inputArrItem();
		menu.inputArrPrice();
		
		System.out.println("--메뉴--");
		for(int i = 0; i < len; i++) {
			pv.printMenu(menu, i);
		}
		
		Game game = new Game();
		int myNum;
		
		while(true) {
			myNum = game.inputNum();
			
			if(myNum < 0 || myNum > len) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			} else if (myNum == 0){
				break;
			}
			
			game.sumMenuPrice(menu, myNum);
			pv.printMenu(menu, myNum);
		}
		
		
	}
}
