package 시험;

import java.util.Scanner;

import JAVA_1229.ATM;

public class Coding_10 {
	static int pick;
	static boolean bo = true;
	static int AT;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coding_10_atm atm= new Coding_10_atm();
		
		
		int pick;
		System.out.println("ATM에 오신걸 환영합니다 사용하실 업무를 선택해 주세요.");
		while (bo) {
			System.out.println("====================================");
			System.out.println("| 1. 입금 | 2. 출금 | 3. 조회 | 4. 종료 |");
			System.out.println("====================================");
			pick = sc.nextInt();

			switch (pick) {
			case 1:
				deposit(atm);
				break;

			case 2:
				withdraw(atm);

				break;

			case 3:
				Lookup(atm);
				break;
			case 4:
				ESC();
				break;
			}

		}

	}
	public static void deposit(Coding_10_atm atm) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("입금하실 금액을 입력하세요");
         pick = sc.nextInt();
         AT=atm.getMoney();
        AT+=pick;
		
	}
	public static void withdraw(Coding_10_atm atm) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출금하실 금액을 입력하세요");
        pick = sc.nextInt();
        if(AT<pick) {
        	System.out.println("잔액 부족");
        }else {
        	AT-=pick;
        }
	}
	public static void Lookup(Coding_10_atm atm) {
		System.out.println("잔액을 조회 합니다");
		System.out.println("====================================");
		System.out.println("현재 가진 금액은 : "+AT+" 원 입니다.");

	}
	public static void ESC() {
		System.out.println("안녕히 가세요!"); 
		bo=false;
	}

}

