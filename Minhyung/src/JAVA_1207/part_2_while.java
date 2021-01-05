package JAVA_1207;

import java.util.Scanner;

public class part_2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num_1=0;
		int num_2=0;
		while (run) {
			System.out.println("(+,-,*,/) 를 선택해주세요.");
			String str = sc.next();
			 if(str.equals("/")) {
				 double num_3=(double)num_1;
				 double num_4=(double)num_2;
			 }
				 
			System.out.println("숫자를 입력해주세요.");
			num_1 = sc.nextInt();
			System.out.println("숫자를 입력해주세요.");
		    num_2 = sc.nextInt();
			
			switch (str) {
			case ("+"):
				int i = num_1 + num_2;
				System.out.println(num_1 + " + " + num_2 + " = " + i + "입니다.");
				System.out.println("계산을 계속 하시겠습니까?  1.예  2.아니요");
				int a = sc.nextInt();
				if (a == 2) {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
				break;
				
			case ("-"):
				int j = num_1 - num_2;
				System.out.println(num_1 + " - " + num_2 + " = " + j + "입니다.");
				System.out.println("계산을 계속 하시겠습니까?  1.예  2.아니요");
				int b = sc.nextInt();
				if (b == 2) {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
				break;
				
			case ("*"):
				int k = num_1 * num_2;
				System.out.println(num_1 + " x " + num_2 + " = " + k + "입니다.");
				System.out.println("계산을 계속 하시겠습니까?  1.예  2.아니요");
				int c = sc.nextInt();
				if (c == 2) {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
				break;
				
			case ("/"):
				double l = (double) num_1 / (double) num_2;
				System.out.println(num_1 + " / " + num_2 + " = " + l + "입니다.");
				System.out.println("계산을 계속 하시겠습니까?  1.예  2.아니요");
				int d = sc.nextInt();
				if (d == 2) {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
				break;
				
			default:
				System.out.println("잘못 선택하셨습니다.(+,-,*,/) 중 선택해주세요.");
			}

		}
	}

}
