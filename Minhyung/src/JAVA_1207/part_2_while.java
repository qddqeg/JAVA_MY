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
			System.out.println("(+,-,*,/) �� �������ּ���.");
			String str = sc.next();
			 if(str.equals("/")) {
				 double num_3=(double)num_1;
				 double num_4=(double)num_2;
			 }
				 
			System.out.println("���ڸ� �Է����ּ���.");
			num_1 = sc.nextInt();
			System.out.println("���ڸ� �Է����ּ���.");
		    num_2 = sc.nextInt();
			
			switch (str) {
			case ("+"):
				int i = num_1 + num_2;
				System.out.println(num_1 + " + " + num_2 + " = " + i + "�Դϴ�.");
				System.out.println("����� ��� �Ͻðڽ��ϱ�?  1.��  2.�ƴϿ�");
				int a = sc.nextInt();
				if (a == 2) {
					run = false;
					System.out.println("����� �����մϴ�.");
				}
				break;
				
			case ("-"):
				int j = num_1 - num_2;
				System.out.println(num_1 + " - " + num_2 + " = " + j + "�Դϴ�.");
				System.out.println("����� ��� �Ͻðڽ��ϱ�?  1.��  2.�ƴϿ�");
				int b = sc.nextInt();
				if (b == 2) {
					run = false;
					System.out.println("����� �����մϴ�.");
				}
				break;
				
			case ("*"):
				int k = num_1 * num_2;
				System.out.println(num_1 + " x " + num_2 + " = " + k + "�Դϴ�.");
				System.out.println("����� ��� �Ͻðڽ��ϱ�?  1.��  2.�ƴϿ�");
				int c = sc.nextInt();
				if (c == 2) {
					run = false;
					System.out.println("����� �����մϴ�.");
				}
				break;
				
			case ("/"):
				double l = (double) num_1 / (double) num_2;
				System.out.println(num_1 + " / " + num_2 + " = " + l + "�Դϴ�.");
				System.out.println("����� ��� �Ͻðڽ��ϱ�?  1.��  2.�ƴϿ�");
				int d = sc.nextInt();
				if (d == 2) {
					run = false;
					System.out.println("����� �����մϴ�.");
				}
				break;
				
			default:
				System.out.println("�߸� �����ϼ̽��ϴ�.(+,-,*,/) �� �������ּ���.");
			}

		}
	}

}
