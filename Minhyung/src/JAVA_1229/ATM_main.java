package JAVA_1229;

import java.util.Scanner;

public class ATM_main {
	static int pick;
	static boolean bo = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM money= new ATM();
		
		
		int pick;
		System.out.println("ATM에 오신걸 환영합니다 사용하실 업무를 선택해 주세요.");
		while (bo) {
			System.out.println("====================================");
			System.out.println("| 1. 입금 | 2. 출금 | 3. 조회 | 4. 종료 |");
			System.out.println("====================================");
			pick = sc.nextInt();

			switch (pick) {
			case 1:
				deposit(money);
				break;

			case 2:
				withdraw(money);

				break;

			case 3:
				Lookup(money);
				break;
			case 4:
				ESC();
				break;
			}

		}

	}
	public static void deposit(ATM money) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("입금하실 금액을 입력하세요");
         pick = sc.nextInt();
         money.money+=pick;
		
	}
	public static void withdraw(ATM money) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출금하실 금액을 입력하세요");
        pick = sc.nextInt();
        if(money.money<pick) {
        	System.out.println("잔액 부족");
        }else {
        	money.money-=pick;
        }
	}
	public static void Lookup(ATM money) {
		System.out.println("잔액을 조회 합니다");
		System.out.println("====================================");
		System.out.println("현재 가진 금액은 : "+money.money+" 원 입니다.");

	}
	public static void ESC() {
		System.out.println("안녕히 가세요!"); 
		bo=false;
	}

}
