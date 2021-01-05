package JAVA_0105;

import java.util.Scanner;



public class Phone_book {
	Book[] book_array;
	int current;
static Scanner sc = new Scanner(System.in);


	public Phone_book() {
		this.book_array = new Book[3];
		this.current = 0;
		
	}

	public void Enrollment() {
		
		Book bk = new Book();
		System.out.println("=========================================");
		System.out.println("|               등록을 합니다               |");
		System.out.println("=========================================");
		System.out.println();
		String name;
		String Number;
		String Relation;
		System.out.println(current + 1 + ". 이름 : ");
		name = sc.next();

		System.out.println(current + 1 + ". 전화번호 : ");
		Number = sc.next();

		System.out.println(current + 1 + ". 관계 : ");
		Relation = sc.next();

		System.out.println("----------------------------------");
		bk.setRelation(Relation);
		bk.setNumber(Number);
		bk.setName(name);
		
		if (book_array.length == current) {
			Book[] temp = new Book[book_array.length + 5];
			for (int i = 0; i < book_array.length; i++) {
				temp[i] = book_array[i];
			}
			book_array = temp;
		}

		

		book_array[current] = bk;
		current++;

	}

	public void Example() {
		System.out.println("=========================================");
		System.out.println("|              전화번호부 보기              |");
		System.out.println("=========================================");

		for (int i = 0; i < current; i++) {
			Book bk = book_array[i];
			
			System.out.println(". 이름 : " + bk.getName());
			System.out.println(". 전화번호 : " + bk.getNumber());
			System.out.println(". 관계 : " + bk.getRelation());
			System.out.println("--------------------------------------------");
			

		}
	}
	public void Search() {
		System.out.println("=========================================");
		System.out.println("|                검색하기                 |");
		System.out.println("=========================================");
		String name=sc.nextInt();
	}
}
