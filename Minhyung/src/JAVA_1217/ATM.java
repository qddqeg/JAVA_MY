package JAVA_1217;

import java.util.Scanner;

public class ATM {

	public static void Lookup(String name, String mycard) {
		System.out.println("ATM���� ���Ű� ȯ���մϴ�.");
		System.out.println(name + " ���� " + mycard + " �� �ν��մϴ�");

	}

	public static void menu(int mymoney) {
		boolean bo = true;
		while (bo) {

			System.out.println("| 1. ��ȸ | 2. ��� | 3. �Ա� |");
			Scanner sc = new Scanner(System.in);
			int pick = sc.nextInt();
			switch (pick) {
			case 1:
				System.out.println("�ܾ��� ��ȸ �մϴ�.");
				System.out.println("���� �ݾ��� : " + mymoney + " �� �Դϴ�.");
				System.out.println("===============================");
				System.out.println("������ ���� �Ͻðڽ��ϱ�?| 1. �� | 2. �ƴϿ�|");
				pick = sc.nextInt();
				if (pick == 1) {
					System.out.println("ī��� ��ǥ�� �޾��ּ���.");
					bo = false;
				}
				break;

			case 2:
				System.out.println("����Ͻ� �ݾ��� �Է� ���ּ���.");
				System.out.println("===============================");
				pick = sc.nextInt();
				if (mymoney < pick) {
					System.out.println("�ݾ��� �����մϴ�.");
				} else {
					mymoney -= pick;
					System.out.println("����Ͻ� �ݾ��� : " + pick + " �� �Դϴ�.");

					System.out.println("���� �ݾ��� : " + mymoney + " �� �Դϴ�.");
					System.out.println("������ ���� �Ͻðڽ��ϱ�?| 1. �� | 2. �ƴϿ�|");
					pick = sc.nextInt();
					if (pick == 1) {
						System.out.println("ī��� ��ǥ�� �޾��ּ���.");
						bo = false;
					}

				}

				break;
				
			case 3:
				System.out.println("�Ա��Ͻ� �ݾ��� �Է� ���ּ���.");
			System.out.println("===============================");
			pick = sc.nextInt();
			mymoney += pick;
			System.out.println("�Ա��Ͻ� �ݾ��� : " + pick + " �� �Դϴ�.");

			System.out.println("���� �ݾ��� : " + mymoney + " �� �Դϴ�.");
			System.out.println("������ ���� �Ͻðڽ��ϱ�?| 1. �� | 2. �ƴϿ�|");
			pick = sc.nextInt();
			if (pick == 1) {
				System.out.println("ī��� ��ǥ�� �޾��ּ���.");
				bo = false;
			}
			break;


			}

		}
	}

}
