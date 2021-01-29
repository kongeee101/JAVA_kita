package com.kita.first.level3;

//추상클래스
public abstract class Animal {
//	abstract : 추상이 됨, new로 찍어낼 수 없고 상속만 가능, 필드에는 안됨 클래스랑 메소드만
//	Animal(){
//		super();
//	}
	
	//추상메소드
	abstract void crying(); //private 사용 불가, <<반드시>> override(재정의) 해야하니까
	
//	void crying() {
//		System.out.println("동물이 우우 운다.");
//	}
}
