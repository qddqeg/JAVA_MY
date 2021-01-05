package JAVA_1209;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sum = 0;
		while (run) {
			System.out.println("첫번째 숫자를 입력해주세요.");
			int num_1 = sc.nextInt();
			System.out.println("두번쨰 숫자를 입력해주세요.");
			int num_2 = sc.nextInt();
			System.out.println("연산자를 입력해주세요(+,-,*,/,)");
			String str = sc.next();

			switch (str) {
			case ("+"):
				sum = num_1 + num_2;
				System.out.println(num_1 + " + " + num_2 + " = " + sum + " 입니다.");
				
				
				break;

			case ("-"):
				sum = num_1 - num_2;
				System.out.println(num_1 + " - " + num_2 + " = " + sum + " 입니다.");
				break;

			case ("*"):
				sum = num_1 * num_2;
				System.out.println(num_1 + " x " + num_2 + " = " + sum + " 입니다.");
				break;

			case ("/"):
				double sum_1 = (double) num_1 / (double) num_2;
				System.out.println(num_1 + " x " + num_2 + " = " + sum_1 + " 입니다.");
				break;

			default:
				System.out.println("연산자를 잘못 입력하셨습니다.(+,-,*,/,) 중 선택해주세요.");
				break;
			}

		}
		

	}

}
