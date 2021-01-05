package JAVA_1203;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요 :");
		int a = sc.nextInt();
		
		if((a<0)||(a>9)) {
			System.out.println("잘못 입력하셧습니다.");
	
		}
		

		System.out.println("계산할 연산자를 입력하세요 :");
		String str = sc.next();

		System.out.println("계산할 숫자를 입력하세요. :");
		int b = sc.nextInt();

		int result = 0;

		System.out.println(str + "연산을 하시겠네요.");

		if (str.equals("+")) {
			result = a + b;
			System.out.println(result);

		}
		if (str.equals("-")) {
			result = a - b;
			System.out.println(result);

		}
		if (str.equals("*")) {
			result = a * b;
			System.out.println(result);

		}
		if (str.equals("/")) {

			double res = (double) a / (double) b;

			System.out.println(res);

//		switch(str) {
//		case("+"):
//		  result = a +b;
//		System.out.println(result); 
//		break;
//		
//		case("-"):
//			result = a -b;
//		System.out.println(result);
//		break;
//		
//		case("*"):
//			result = a *b;
//		System.out.println(result);
//		break;
//		
//		case("/"):
//			double res = (double) a / (double) b;
//		 System.out.println(res);
//		 break;
//		 
//		default:
//			System.out.println("잘못입력하셨습니다(+,-,*,/) 중 선택 해주세요.");
		}

	}

}
