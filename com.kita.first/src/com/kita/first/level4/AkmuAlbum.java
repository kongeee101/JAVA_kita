package com.kita.first.level4;

//인터페이스 : 설계방법 정의. 클래스는 설계도
public interface AkmuAlbum {
	//필드 : 무조건 상수만
	//인터페이스에서는 public static final 없어도 자동으로 됨
	public static final String SONG_WRITER = "이찬혁";
	int PRICE = 20_000;
	
	//추상메소드 : 얘도 public abstract 없어도 자동
	public abstract void playAkmuAlbum();
	void stopAkmuAlbum();
}
