package JAVA_1203;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ��� :");
		int a = sc.nextInt();
		
		if((a<0)||(a>9)) {
			System.out.println("�߸� �Է��ϼ˽��ϴ�.");
	
		}
		

		System.out.println("����� �����ڸ� �Է��ϼ��� :");
		String str = sc.next();

		System.out.println("����� ���ڸ� �Է��ϼ���. :");
		int b = sc.nextInt();

		int result = 0;

		System.out.println(str + "������ �Ͻðڳ׿�.");

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
//			System.out.println("�߸��Է��ϼ̽��ϴ�(+,-,*,/) �� ���� ���ּ���.");
		}

	}

}
