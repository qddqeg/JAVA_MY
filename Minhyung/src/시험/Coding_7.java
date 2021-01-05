package 시험;

import java.util.Scanner;

public class Coding_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 몇개를 받으시겠습니까? ");
		int pick = sc.nextInt();
		int num[] = new int[pick];
		for (int i = 0; i < pick; i++) {
			System.out.println(i + 1 + " 번째 숫자입니다.");
			num[i] = sc.nextInt();
		}
//		for(int k:num) {
//			System.out.println(k);
//		}
		System.out.println("연산자를 입력헤주세요");
		String str = sc.next();
		int result = 0;
		double result_1 = 0.0;
		switch (str) {
		case ("+"):
			for (int i = 0; i < num.length; i++) {
				result += num[i];

			}
			System.out.println("더하기 연산 : " + result);
			break;

		case ("-"):
			for (int i = 0; i < num.length; i++) {
				if (result == 0) {
					result = num[i];
				} else {
					result -= num[i];
				}

			}
			System.out.println("빼기 연산 : " + result);
			break;

		case ("*"):
			for (int i = 0; i < num.length; i++) {
				if (result == 0) {
					result = num[i];
				} else {
					result *= num[i];
				}
				

			}
			System.out.println("곱하기 연산 : " + result);
			break;

		case ("/"):
			for (int i = 0; i < num.length; i++) {
				if (result_1 == 0) {
					result_1 = num[i];
				} else {
					result_1 /= num[i];
				}
				

			}
			System.out.println("나누기 연산 : " + result_1);
			break;
		}
	}

}
