package JAVA_1210;

import java.util.Scanner;

public class �ܹ����ֹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܹ��� �ֹ� ���ּ���.");
		boolean run = true;
		
		// �ݾ� �հ�
		int sum = 0;
		// ��Ʈ �޴� ����ǥ
		int shrimpST = 6000;
		int BulgogiST = 6000;
		int childST = 5000;
		int morningST = 5000;
		// ���� �޴� ����ǥ
		int coke = 1500;
		int cider = 1500;
		int mill = 1000;
		int coffee = 2000;
		while (run) {
			System.out.println("1. ��Ʈ ");
			System.out.println("2. ���� ");
			int pick = sc.nextInt();
            
			switch (pick) {
			case 1:
				System.out.println("1.������� ��Ʈ");
				System.out.println("2.�Ұ����� ��Ʈ");
				System.out.println("3.��̹��� ��Ʈ");
				System.out.println("4.��� ��Ʈ");
				pick = sc.nextInt();
				switch (pick) {
				case 1:
					System.out.println("�����Ͻ� ������� ��Ʈ ������ " + shrimpST + " ���Դϴ�.");
					sum += shrimpST;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}

					if(pick == 2) {
					System.out.println("����â���� �̵��մϴ�.");	
					run = false;
					}
				
					break;

				case 2:

					System.out.println("�����Ͻ� �Ұ����� ��Ʈ ������ " + BulgogiST + " ���Դϴ�.");
					sum += BulgogiST;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;

				case 3:
					System.out.println("�����Ͻ� ��̹��� ��Ʈ ������ " + childST + " ���Դϴ�.");
					sum += childST;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;

				case 4:
					System.out.println("�����Ͻ� ��� ��Ʈ ������ " + morningST + " ���Դϴ�.");
					sum += morningST;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 1) {
						continue;
					}
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;
					//���� ����â
				}
			case 2:
				System.out.println("1.�ݶ� ");
				System.out.println("2.���̴� ");
				System.out.println("3.���� ");
				System.out.println("4.Ŀ��"); 
				pick = sc.nextInt();
				switch (pick) {
				case 1:
					System.out.println("�����Ͻ� �ݶ� ������ " + coke + " ���Դϴ�.");
					sum += coke;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;

				case 2:

					System.out.println("�����Ͻ� ���̴� ������ " + cider + " ���Դϴ�.");
					sum += cider;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;

				case 3:
					System.out.println("�����Ͻ� ���� ������ " + mill + " ���Դϴ�.");
					sum += mill;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;

				case 4:
					System.out.println("�����Ͻ� Ŀ�� ������ " + coffee + " ���Դϴ�.");
					sum += coffee;
					System.out.println("���� �ֹ��Ͻ� ���� �ݾ��� :" + sum + " �� �Դϴ�.");
					System.out.println("=======================================");
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  1.��   2.�ƴϿ�");
					pick = sc.nextInt();
					if (pick == 2) {
						System.out.println("����â���� �̵��մϴ�.");
						run = false;
					}
					break;

				}

			}

		}
		System.out.println("=======================================");
		System.out.println("�� ���� �ݾ��� " + sum + " �� �Դϴ�.");

	}
}
