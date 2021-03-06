package com.kita.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList<MenuItem>();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노", 4100));
		arr.add(new MenuItem("카페라떼", 4500));
		arr.add(new MenuItem("바닐라라떼", 4800));
		arr.add(new MenuItem("카라멜마끼아또", 5000));
	}
	public void menuSetter(MenuItem mi) {
		arr.add(mi);
	}
	public String showMenu() {
		System.out.println(" Menu ");
		for(int i = 0; i < arr.size(); i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s\t\t%,d원\n", i+1, m.getName(), m.getPrice());
		}
		return "";
	}
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
}
