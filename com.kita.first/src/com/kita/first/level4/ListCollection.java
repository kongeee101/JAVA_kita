package com.kita.first.level4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		// Card(블랙잭게임)
		List<String> list = new ArrayList<String>(); // 이거나 LinkedList
		//<> 이게 제네릭, 값을 한정짓게.. 앞에 제네릭 해두면 뒤에는 <> 이렇게 해도 됨.
		//String대신 객체 아무거나 넣어도 가능
//		int[] arr = new int[5];
		list.add("안녕");
		list.add("하세요");
		list.add(2, "저는");
		
		list.set(0, "Hi");
		list.remove(2);
		String result = list.get(1);
		System.out.println(result);

		//arratlist는 계속 새로 만들면서 배열을 처리
		//linkedlist는 참조하여 앞뒤 배열과 주솟값만 공유
		//사슬처럼 연결됨, 빠르지만 순차적 처리할 때는 느림
		
		//스택과 큐(queue, 줄)
		//스택 : firstin-lastout
		//큐 : firstin-firstout
		
		List<Cd> shelf = new LinkedList<Cd>();
		Cd cd1 = new Cd("에잇", "아이유", 2019);
		Cd cd2 = new Cd("항해", "악뮤", 2020);
		shelf.add(cd1);
		shelf.add(cd2);
		shelf.add(cd2);
	}
}
