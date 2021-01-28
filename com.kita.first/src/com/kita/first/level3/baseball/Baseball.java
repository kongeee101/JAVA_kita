package com.kita.first.level3.baseball;

public class Baseball {
//	 컴퓨터가 랜덤으로 숫자 뽑는 클래스
	//필드
	private int[] rArr;
	
	//생성자
	public Baseball(int LEN) {
		init(LEN);
	}
	
	//메소드
	private void init(int LEN) {
		rArr = new int[LEN];
		setRandom(LEN);
	} // 깔끔하게 만드는거임
	
	private void setRandom(int LEN) {
		int min = 0;
		int max = 9;
		
		for(int i = 0; i < LEN; i++) {
			rArr[i] = (int)(Math.random()*(max-min+1)+min);
			for(int j = 0; j < i; j++) {
				if(rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		for(int num : rArr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	//getter setter
	public void setrArr(int[] rArr) {
		this.rArr = rArr;
	}
	public int[] getrArr() {
		return rArr;
	}
}
