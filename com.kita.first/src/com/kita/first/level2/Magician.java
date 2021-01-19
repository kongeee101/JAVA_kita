package com.kita.first.level2;

public class Magician extends Adventurer{
	int mp;
	
	Magician(int strength, int intellegence, int dexterity, int luck, int mp){
		super(strength, intellegence, dexterity, luck);
		this.mp = mp;
	}
	
	@Override // 오버라이딩 한다는 표시, 오버라이딩했는지 확인도 해줌
	// 상속을 받아야지 가능
	void attack() {
		System.out.println("마법 공격을 한다.");
	}
	void teleport() {
		System.out.println("텔레포트 이동을 한다.");
	}
//	@Override
//	void jump() {
//		System.out.println("마법 점프를 한다.");
//	}
}
