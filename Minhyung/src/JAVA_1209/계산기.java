package JAVA_1209;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sum = 0;
		while (run) {
			System.out.println("ù��° ���ڸ� �Է����ּ���.");
			int num_1 = sc.nextInt();
			System.out.println("�ι��� ���ڸ� �Է����ּ���.");
			int num_2 = sc.nextInt();
			System.out.println("�����ڸ� �Է����ּ���(+,-,*,/,)");
			String str = sc.next();

			switch (str) {
			case ("+"):
				sum = num_1 + num_2;
				System.out.println(num_1 + " + " + num_2 + " = " + sum + " �Դϴ�.");
				
				
				break;

			case ("-"):
				sum = num_1 - num_2;
				System.out.println(num_1 + " - " + num_2 + " = " + sum + " �Դϴ�.");
				break;

			case ("*"):
				sum = num_1 * num_2;
				System.out.println(num_1 + " x " + num_2 + " = " + sum + " �Դϴ�.");
				break;

			case ("/"):
				double sum_1 = (double) num_1 / (double) num_2;
				System.out.println(num_1 + " x " + num_2 + " = " + sum_1 + " �Դϴ�.");
				break;

			default:
				System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.(+,-,*,/,) �� �������ּ���.");
				break;
			}

		}
		

	}

}
