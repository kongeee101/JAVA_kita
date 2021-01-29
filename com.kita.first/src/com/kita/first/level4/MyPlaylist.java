package com.kita.first.level4;

public class MyPlaylist implements AkmuAlbum, IUAlbum{
	//인터페이스는 다중상속 가능!
	//무조건 public 붙여야함! AkmuAlbum에 메소드가 public이니까 public 이상으로 해야함
	@Override
	public void playAkmuAlbum() {
		System.out.println("항해 앨범을 재생합니다.");
	}
	@Override
	public void stopAkmuAlbum() {
		System.out.println("항해 앨범을 정지합니다.");
	}
	@Override
	public void playIUAlbum() {
		System.out.println("셀러브리티 앨범을 재생합니다.");
	}
	@Override
	public void stopIUAlbum() {
		System.out.println("셀러브리티 앨범을 정지합니다.");
	}
	
	public void playIdleAlbum() {
		System.out.println("화 앨범을 재생합니다.");
	}
	
	public void stopIdleAlbum() {
		System.out.println("화 앨범을 정지합니다.");
	}
}
