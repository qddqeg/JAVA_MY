package While_class;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean stop = false;

		int num;
		Plus plus = new Plus();
		Multi mt = new Multi();
		Minus mi = new Minus();
		Div div = new Div();

		while (!stop) {

			System.out.println("두개의 정수를 입력하셔야합니다.");

			Scanner sc = new Scanner(System.in);

			System.out.println("첫번째 수를 입력하세요.");

			int num1 = sc.nextInt();

			System.out.println("두번째 수를 입력하세요.");

			int num2 = sc.nextInt();

			System.out.println("세번째 수를 입력하세요.");

			int num3 = sc.nextInt();

			System.out.println("어떤 연산을 하시겠어요? + - x / %");

			String k = sc.next();

//System.out.println("sc"+k);

			if (k.equals("X")) {
				System.out.println(mt.Plus(num1, num2, num3));
			}
			
			if (k.equals("+")) {
				System.out.println(plus.Plus(num1, num2, num3));
			}			

			if (k.equals("-")) {
				System.out.println(mi.Plus(num1, num2, num3));
			}

			if (k.equals("/")) {
				System.out.println(div.Plus(num1, num2, num3));

			}

			if (k.equals("%")) {
				System.out.println(num1 + "," + num2 + "," + num3 + "중에서 분자를 선택하세요");
				int frist = sc.nextInt();
				System.out.println(num1 + "," + num2 + "," + num3 + "중에서 분모를 선택하세요");
				int second = sc.nextInt();
				System.out.println((double) frist / second * 100);

			}

			System.out.println("계속 Y, 종료 N 입력");

			String yn = sc.next();

			if (yn.equals("Y") || yn.equals("y")) {

				System.out.println("---------------------");

				continue;

			}

			if (yn.equals("N") || yn.equals("n")) {

				break;

			}

		}

		System.out.println("시스템이 종료되었습니다.");

	}

}