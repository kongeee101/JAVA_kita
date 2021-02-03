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
		
		
		//ThrowsException, trycatch로 예외처리
		ThrowsException2 te2 = new ThrowsException2();
		te2.method1();
		
		//에러처리~
//		int err = 0;
//		
//		if(err > 0) {
//			err++;
//		}
//		
//		switch(err) {
//		case 1:
//			System.out.println();
//			break;
//		}
		
		//익명객체 : 객체를 한번만 쓸때 간단하게 처리 가능, 세미콜론 필요
		Parent p = new Parent() {
			String childField = "자식필드"; //이 안에서만 쓸 수 있음
			
			void childMethod() {
				System.out.println("자식 메소드입니다.");
			} //이 안에서만 쓸 수 있음
			
			@Override
			void parentMethod() {
				System.out.println(childField + "자식 객체입니다.");
			};
		};
		
		p.parentMethod(); // 이렇게 사용가능
		
		
		Child child = new Child();
		child.childMethod();
		child.childMethod2(new Parent() {
			@Override
			void parentMethod() {};
		});
	}
}
