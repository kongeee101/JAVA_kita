package com.kita.first.level3.vendingmachine;

public class PrintV {
	void printMenu(Menu menu, int i){
		String item = menu.getMenuItem(i);
		int price = menu.getMenuPrice(i);
		System.out.printf("%d. %s %d원\n", i+1, item, price);
	}
	
	void printTotalPrice(Game game) {
		System.out.printf("%d번, 합계 : %d원\n", game.getCount(),game.getTotalPrice());
	}
}
