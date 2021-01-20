package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi{
	public Hwasa(){
		super("인스타");//부모 클래스의 생성자를 가르킴
		//디폴트, 프라이빗 클래스는 안되고, 퍼블릭, 프로텍티드만 됨
		this.sns = "";
		//super.sns = "";
		
		drinkTea();
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
//		hr.sns = "인스타";
//		hr.star = 100000000;
		
//		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(1000000000);
		
		hr.sing();
//		hr.drinkTea(); new로 생성하면 안됨.
//		hr.dance();
		
	}
}
