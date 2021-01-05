package JAVA_1217;

import java.util.Scanner;

public class ATM {

	public static void Lookup(String name, String mycard) {
		System.out.println("ATM기계로 오신걸 환영합니다.");
		System.out.println(name + " 님의 " + mycard + " 를 인식합니다");

	}

	public static void menu(int mymoney) {
		boolean bo = true;
		while (bo) {

			System.out.println("| 1. 조회 | 2. 출금 | 3. 입금 |");
			Scanner sc = new Scanner(System.in);
			int pick = sc.nextInt();
			switch (pick) {
			case 1:
				System.out.println("잔액을 조회 합니다.");
				System.out.println("현재 금액은 : " + mymoney + " 원 입니다.");
				System.out.println("===============================");
				System.out.println("업무를 종료 하시겠습니까?| 1. 예 | 2. 아니요|");
				pick = sc.nextInt();
				if (pick == 1) {
					System.out.println("카드와 명세표를 받아주세요.");
					bo = false;
				}
				break;

			case 2:
				System.out.println("출금하실 금액을 입력 해주세요.");
				System.out.println("===============================");
				pick = sc.nextInt();
				if (mymoney < pick) {
					System.out.println("금액이 부족합니다.");
				} else {
					mymoney -= pick;
					System.out.println("출금하실 금액은 : " + pick + " 원 입니다.");

					System.out.println("현재 금액은 : " + mymoney + " 원 입니다.");
					System.out.println("업무를 종료 하시겠습니까?| 1. 예 | 2. 아니요|");
					pick = sc.nextInt();
					if (pick == 1) {
						System.out.println("카드와 명세표를 받아주세요.");
						bo = false;
					}

				}

				break;
				
			case 3:
				System.out.println("입금하실 금액을 입력 해주세요.");
			System.out.println("===============================");
			pick = sc.nextInt();
			mymoney += pick;
			System.out.println("입금하실 금액은 : " + pick + " 원 입니다.");

			System.out.println("현재 금액은 : " + mymoney + " 원 입니다.");
			System.out.println("업무를 종료 하시겠습니까?| 1. 예 | 2. 아니요|");
			pick = sc.nextInt();
			if (pick == 1) {
				System.out.println("카드와 명세표를 받아주세요.");
				bo = false;
			}
			break;


			}

		}
	}

}
