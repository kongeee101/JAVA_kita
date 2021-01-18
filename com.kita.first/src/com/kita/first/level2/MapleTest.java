package com.kita.first.level2;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer(10, 10, 10, 10);
		Magician mag = new Magician(10, 20, 10, 10, 100);
		
		System.out.println(adv.intellegence);
		System.out.println(mag.intellegence);
//		System.out.println(adv.mp);
		System.out.println(mag.mp);
		
		adv.attack();
		mag.attack();
//		adv.teleport();
		mag.teleport();
		adv.jump();
		mag.jump();
	}
}
