package JAVA_1211;

import java.util.Scanner;

public class ������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean run_1 = true;

		int sum = 0;
		int result = 0;
		while (run) {
			System.out.println("1.���ڸ� �Է��ϼ���");
			int num_1 = sc.nextInt();
			sum += num_1;  //�ʱ⿡ ������ ��
			
			while (run_1) {

				System.out.println("�����ڸ� �Է��ϼ���");
				String str = sc.next();

				switch (str) {

				case ("+"):
					System.out.println("2.���ڸ� �Է����ּ���");
					int num_2 = sc.nextInt();
					result += sum + num_2;
					sum = 0; 
					break;
				case ("-"):
					System.out.println("���ڸ� �Է����ּ���");
					num_2 = sc.nextInt();
					result -= sum - num_2;
					sum = 0;
					break;
				case ("*"):
					System.out.println("���ڸ� �Է����ּ���");
					num_2 = sc.nextInt();
					result *= sum * num_2;
					sum = 0;
					break;
				case ("/"):
					System.out.println("���ڸ� �Է����ּ���");
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

		} System.out.println("��� �Ѱ��� : "+result+ " �Դϴ�.");

	}

}
