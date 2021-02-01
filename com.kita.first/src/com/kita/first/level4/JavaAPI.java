package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		String str = "안녕";
		StringBuffer sb = new StringBuffer("안녕"); // 유사 문자열
		boolean result1 = (str.equals(sb)); // only String
		boolean result2 = (str.contentEquals(sb)); // all
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(p.toString());
		
		str = "123";
		Integer.parseInt(str);
		str = "2.3";
		Double.parseDouble(str);
		
		Math.random(); // 0~0.9999999999
		int max = 10;
		int min = 0;
		int rd = (int)(Math.random()*(max-min+1)+min);
		System.out.println(rd);
		
		String.valueOf(rd); //데이터베이스에 값을 집어넣을때
	}
}
