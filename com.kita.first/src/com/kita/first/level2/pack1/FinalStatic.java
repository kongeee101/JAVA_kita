package com.kita.first.level2.pack1;

public final class FinalStatic {
	// final 붙으면 다른 클래스가 상속받을 수 없어짐, 자식 만들 수 없음
	final int N1;
	static final int N2 = 4;
	/*static*/ int n3 = 1;
	
	FinalStatic(int n1, int n2){
		this.N1 = n1;
		printNum(n1);
		n3 = n2;
	}
	// 메소드에 final이 붙으면 오버라이딩 안됨.
	static final void printNum(int input) {
		System.out.println(input);
//		System.out.println(n3); // n3에 static이 없으면 오류!
//		call; // 이것도 오류! 이 메소드가 static이 있으니까 그런거임!
	}
	void call() {
		System.out.println("안녕");
	}
}
