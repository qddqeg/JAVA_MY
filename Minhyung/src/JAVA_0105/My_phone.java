package JAVA_0105;

import java.util.Scanner;

public class My_phone {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Phone_book pb = new Phone_book();
		//pb.book_array = new Book[3];
        //pb.current = 0;
		boolean bo = true;

		while (bo) {
			System.out.println("=========================================");
			System.out.println("|               전화번호 부                |");
			System.out.println("=========================================");
			System.out.println("\t1. 전화번호 등록");
			System.out.println("\t2. 전화번호부 보기");
			System.out.println("\t3. 검색");
			System.out.println("\t3. 종료");
			int pick = sc.nextInt();
			switch (pick) {
			case 1:
				pb.Enrollment();
				break;

			case 2:
				pb.Example();
				break;

			case 3:
				pb.Search();
				break;
				
			case 4:
				bo = false;
				break;
			}

		}

	}

	
}
