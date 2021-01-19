package com.kita.first.level2.pack1;

public class Singleton {
	private static Singleton sg = null;
	//하나의 객체만 사용하도록 만듦
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(sg == null) {
			sg = new Singleton();
		}
		return sg;
	}
}
