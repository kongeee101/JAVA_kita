package com.kita.first.level2;

//import com.kita.first.level2.pack1.Class1;
import com.kita.first.level2.mamamoo.*;//*은 전체의 의미, 근데 클래스 파일만 들고옴, 패키지 안됨!

public class Test {
	public static void main(String[] args) {
//		Class1 c1 = new Class1();
//		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		
		Hwasa hs = new Hwasa();
		
		Car volvo = new Car(30);
//		volvo.speed = 50; 내 귀염둥이 붕붕카 ㅎ
//		System.out.println(volvo.speed); 프라이빗하면 안됨.
		int volvoSpeed = volvo.getSpeed();
		System.out.println(volvoSpeed);
		
//		Car volvoC = new Car("흰색");
		volvo.setColor("흰색");
		String volvoColor = volvo.getColor();
		System.out.println(volvoColor);
		
		volvo.setColor("검은색");
		volvoColor = volvo.getColor();
		System.out.println(volvoColor);
	}
}
