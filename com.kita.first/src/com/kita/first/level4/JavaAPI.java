package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		String str = "오늘은 날씨가 좋다.";
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
		
		//포장한다? 왔다갔다 가능하다? 뭐 그렇대
		int num = new Integer(1000); // 혹은 문자열 "1000"도 가능
		char ch = new Character('A');
		double num2 = new Double("34.56787");
		
		Character v1 = str.charAt(4);
		System.out.println(v1);
		
		int num3 = new Integer("011021");
		System.out.println(num3); // 0 사라짐 그래서 주민등록번호는 문자로
		
		String ad = "011021-345678";
		Character c = ad.charAt(7);
		
		switch(c) {
		case 1:
		case 3:
			System.out.println("남");
			break;
		case 2:
		case 4:
			System.out.println("여");
			break;
		}
		
		int idx = str.indexOf("날씨가");
		System.out.println(idx);
		
		int len = str.length();
		System.out.println(len);
		
		String str2 = str.replace("날씨가", "기분이");
		System.out.println(str2);
		
		String str3 = str.substring(4);
		System.out.println(str3);
		
		String str4 = str.substring(4, 7); //end인덱스에는 자르기 시작할 인덱스번호
		System.out.println(str4);
		
		String str5 = "Hello I'm fine thank you and you?";
		String str6 = str5.toLowerCase();
		String str7 = str5.toUpperCase();
		System.out.println(str6);
		System.out.println(str7);
		
		String str8 = "    안녕        ";
		String str9 = str8.trim();
		System.out.println(str9);
		
//		Math.random();
		double n1 = Math.abs(-3.4); // 절댓값
		System.out.println(n1);
		
		double n2 = Math.ceil(5.6); // 올림값
		//int n2 = (int)Math.ceil(5.6);
		System.out.println(n2);
		n2 = Math.ceil(-4.8);
		System.out.println(n2);
		
		double n3 = Math.floor(5.7); // 내림값
		System.out.println(n3);
		
		double n4 = Math.round(4.5); // 반올림값
		System.out.println(n4);
	}
}
