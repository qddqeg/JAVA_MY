package 시험;

import java.util.Scanner;

public class SmartPhone {

	public static void main(String[] args) {
		Phone_book pb=new Phone_book();
		Call call=new Call();
		Time time=new Time();
		Search seh=new Search();
		boolean bo=true;
		System.out.println("스마트폰 기능을 선택하세요");
		while(bo) {
			System.out.println("=====================================================");
			System.out.println("| 1. 전화번호부 | 2. 전화걸기 | 3. 시간확인 | 4.인터넷 검색 |");
			System.out.println("=====================================================");
			int pick=SCANNER();
			switch(pick) {
			case 1: 
				pb.List();
				break;
				
			case 2:
				call.Pick();
				break;
				
			case 3:
				time.current_time();
				break;
				
			case 4:
				seh.IN_Search();
				break;
				
			}
		}
	}
public static int SCANNER() {
Scanner sc= new Scanner(System.in);
int pick=sc.nextInt();
return pick;
}

public static void STR_SCANNER() {
Scanner sc= new Scanner(System.in);
String search_sc=sc.nextLine();
}

}

