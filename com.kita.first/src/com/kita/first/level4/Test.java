package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
//		AkmuAlbum album = new AkmuAlbum(); 불가능
		AkmuAlbum album1 = new MyPlaylist();
		IUAlbum album2 = new MyPlaylist();
		
		album1.playAkmuAlbum();
		album1.stopAkmuAlbum();
//		album1.playIUAlbum(); 불가능
		album2.playIUAlbum();
		album2.stopIUAlbum();
		
		MyPlaylist mp = (MyPlaylist)album1; //강제형변환,,뭐 인스턴스 써도된다는데 다까먹음
		mp.playIdleAlbum();
		
		ThrowsException te = new ThrowsException();
		try {
			te.method1();
		} catch(Exception e) {
			
		}
	}
}
