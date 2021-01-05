package JAVA_1211;

import java.util.Scanner;

public class 윈도우_계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean run_1 = true;

		int sum = 0;
		int result = 0;
		while (run) {
			System.out.println("1.숫자를 입력하세요");
			int num_1 = sc.nextInt();
			sum += num_1;  //초기에 더해질 값
			
			while (run_1) {

				System.out.println("연산자를 입력하세요");
				String str = sc.next();

				switch (str) {

				case ("+"):
					System.out.println("2.숫자를 입력해주세요");
					int num_2 = sc.nextInt();
					result += sum + num_2;
					sum = 0; 
					break;
				case ("-"):
					System.out.println("숫자를 입력해주세요");
					num_2 = sc.nextInt();
					result -= sum - num_2;
					sum = 0;
					break;
				case ("*"):
					System.out.println("숫자를 입력해주세요");
					num_2 = sc.nextInt();
					result *= sum * num_2;
					sum = 0;
					break;
				case ("/"):
					System.out.println("숫자를 입력해주세요");
					num_2 = sc.nextInt();
					result /= sum / num_2;
					sum = 0;
					break;
				case ("="):
					run=false;
				    run_1=false;
				    break;
				}

			}

		} System.out.println("계산 총값은 : "+result+ " 입니다.");

	}

}
