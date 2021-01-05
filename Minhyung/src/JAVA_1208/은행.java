package JAVA_1208;

import java.util.Scanner;

public class 은행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int mon = 0; // 통장잔고

		while (run) {
			System.out.println("은행에 오신걸 환영합니다.");
			System.out.println(" 1. 입금   2. 출금   3. 조회");
			int i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("입금하실 금액을 넣어주세요.");
				int j = sc.nextInt();
				mon += j;
				System.out.println(j + " 원을 입금하셨습니다.");
				System.out.println("총 통장잔고는 " + mon);
				break;

			case 2:
				System.out.println("출금하실 금액을 입력해주세요.");
				int k = sc.nextInt();
				if (mon < k) {
					System.out.println("잔고가 부족합니다 돈을 뽑으실수 없습니다.");
					System.out.println("===============================");
					break;
				}

				mon -= k; // 총 잔고에서 뺀값

				System.out.println("출금하실 돈은" + k + " 원 입니다.");
				System.out.println("현재 통장 잔고는" + mon + " 원 입니다.");

				break;

			case 3:
				System.out.println("현재 총자산은 " + mon + " 입니다.");
				System.out.println("==========================");
				break;
			}

		}

	}

}
