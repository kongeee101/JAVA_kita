package com.kita.first.level3;

public class MajorTextBook extends Book{
	public MajorTextBook(int maxCapter) {
		super(maxCapter);
	}
	
	@Override
	boolean read() {
		++chapter;
		if(chapter < maxChapter) {
			System.out.println("전공서적을 읽는다.");
			return true;
		}
		System.out.println("전공서적을 다 읽었다.");
		return false;
	}
}
