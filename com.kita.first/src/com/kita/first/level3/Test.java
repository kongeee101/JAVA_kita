package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.crying();
		
//		animal = new Animal();
		
		//다형성
		animal = cat;
		animal.crying();
		animal = new Dog();;
		animal.crying();
//		animal.barking; // 안됨. 부모 클래스에 있는 메소드만 접근 가능
		
//		System.out.println(animal);
//		System.out.println(cat);
//		System.out.println(animal == cat);
		
		
		System.out.println();
		System.out.println();
		
		Student minsu = new Student();
		
		for(int i = 0; i < 5; i++) {
			int result = minsu.readBooks();
			switch(result) {
			case 1: // 민수가 책1을 다 읽었을 경우
				minsu.book1 = new ComicBook(8);
				System.out.println("새 만화책을 가져왔다.");
				break;
			case 2:
				minsu.book2 = new MajorTextBook(7);
				System.out.println("새 전공서적을 가져왔다.");
				break;
			case 3:
				minsu.book3 = new Book(4);
				System.out.println("새 책을 가져왔다.");
				break;
			}
			System.out.println("----------");
		}
		
		System.out.println();
		System.out.println();
		
		ProGamer p1 = new ProGamer();
		Game game = new Game();
		p1.platGame(game);
		
		StardewValley sdew = new StardewValley();
		p1.platGame(sdew);
		
		Lol lol = new Lol();
		p1.platGame(lol);
	}
}
