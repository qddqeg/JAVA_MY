package JAVA_1210;

import java.util.Scanner;

public class 햄버거주문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("햄버거 주문 해주세요.");
		boolean run = true;
		
		// 금액 합계
		int sum = 0;
		// 세트 메뉴 가격표
		int shrimpST = 6000;
		int BulgogiST = 6000;
		int childST = 5000;
		int morningST = 5000;
		// 음료 메뉴 가격표
		int coke = 1500;
		int cider = 1500;
		int mill = 1000;
		int coffee = 2000;
		while (run) {
			System.out.println("1. 세트 ");
			System.out.println("2. 음료 ");
			int pick = sc.nextInt();
            
			switch (pick) {
			case 1:
				System.out.println("1.새우버거 세트");
				System.out.println("2.불고기버거 세트");
				System.out.println("3.어린이버거 세트");
				System.out.println("4.모닝 세트");
				pick = sc.nextInt();
				switch (pick) {
				case 1:
					System.out.println("선택하신 새우버거 세트 가격은 " + shrimpST + " 원입니다.");
					sum += shrimpST;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}

					if(pick == 2) {
					System.out.println("결제창으로 이동합니다.");	
					run = false;
					}
				
					break;

				case 2:

					System.out.println("선택하신 불고기버거 세트 가격은 " + BulgogiST + " 원입니다.");
					sum += BulgogiST;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;

				case 3:
					System.out.println("선택하신 어린이버거 세트 가격은 " + childST + " 원입니다.");
					sum += childST;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;

				case 4:
					System.out.println("선택하신 모닝 세트 가격은 " + morningST + " 원입니다.");
					sum += morningST;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;
					//음료 선택창
				}
			case 2:
				System.out.println("1.콜라 ");
				System.out.println("2.사이다 ");
				System.out.println("3.우유 ");
				System.out.println("4.커피"); 
				pick = sc.nextInt();
				switch (pick) {
				case 1:
					System.out.println("선택하신 콜라 가격은 " + coke + " 원입니다.");
					sum += coke;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;

				case 2:

					System.out.println("선택하신 사이다 가격은 " + cider + " 원입니다.");
					sum += cider;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;

				case 3:
					System.out.println("선택하신 우유 가격은 " + mill + " 원입니다.");
					sum += mill;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;

				case 4:
					System.out.println("선택하신 커피 가격은 " + coffee + " 원입니다.");
					sum += coffee;
					System.out.println("현재 주문하신 음식 금액은 :" + sum + " 원 입니다.");
					System.out.println("=======================================");
					System.out.println("계속 주문하시겠습니까?  1.예   2.아니요");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("결제창으로 이동합니다.");
						run = false;
					}
					break;

				}

			}

		}
		System.out.println("=======================================");
		System.out.println("총 결제 금액은 " + sum + " 원 입니다.");

	}
}
