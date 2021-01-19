package com.kita.first.level2.pack1;

public class Class1 {
	private int n1; //필드에서는 private 많이 쓰는 편
	
	protected Class1(int n1){
		this.n1 = n1;
	}
	// private : 생성자를 이 클래스 내부에서만 쓸 수 있게 한정시킴.
	// protected : 상속받은 자식 클래스에서는 사용 가능?인듯?
	void print(int input) {
		System.out.println(input);
	}
}
