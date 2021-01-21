package com.kita.first.level2.practice2;

public class PTest03 {
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김댕댕", 20);
		myP.setName("김냥냥");
//		String myName = myP.getName();
//		int myAge = myP.getAge();
		
		System.out.printf("이름 : %s\n나이 : %d", myP.getName(), myP.getAge());
	}
}
