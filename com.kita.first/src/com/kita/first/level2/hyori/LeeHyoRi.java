package com.kita.first.level2.hyori;

public class LeeHyoRi {
	//클래스에는 >>퍼블릭<<이나 디폴트(앞에 아무것도 안적힘)
	
	//필드
	public String music;
	protected String sns;
	private int star;
		
	//생성자
	public LeeHyoRi() {}
	protected LeeHyoRi(String sns){
		this.sns = sns;
	}
	private LeeHyoRi(int star) {
		this.star = star;
	}
		
	//메소드
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		hr.sns = "인스타";
		hr.star = 100000000;
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
		LeeHyoRi hr3 = new LeeHyoRi(1000000000);
		hr.sing();
		hr.drinkTea();
//		hr.dance();
	}
	public void sing() {}
	protected void drinkTea() {}
//	private void dance();
}
