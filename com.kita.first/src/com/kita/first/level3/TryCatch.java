package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args) {
		String str = "123.45";
//		int num1 = Integer.parseInt(str);
		double num2 = Double.parseDouble(str);
		
		Animal ani = new Animal();
		Cat cat = new Cat();
		ani = cat;
		
		try {
			Dog dog = (Dog)ani;
		} catch(Exception e) { // 에러가 터지면 실행
//			e.printStackTrace();
			System.out.println("문제 발생");
		} finally { // if문의 else처럼 옵션, 에러가 터지든말든 실행
			System.out.println("형변환 시도 종료");
		}
	}
}
