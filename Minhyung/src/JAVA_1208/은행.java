package JAVA_1208;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int mon = 0; // �����ܰ�

		while (run) {
			System.out.println("���࿡ ���Ű� ȯ���մϴ�.");
			System.out.println(" 1. �Ա�   2. ���   3. ��ȸ");
			int i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("�Ա��Ͻ� �ݾ��� �־��ּ���.");
				int j = sc.nextInt();
				mon += j;
				System.out.println(j + " ���� �Ա��ϼ̽��ϴ�.");
				System.out.println("�� �����ܰ�� " + mon);
				break;

			case 2:
				System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
				int k = sc.nextInt();
				if (mon < k) {
					System.out.println("�ܰ� �����մϴ� ���� �����Ǽ� �����ϴ�.");
					System.out.println("===============================");
					break;
				}

				mon -= k; // �� �ܰ��� ����

				System.out.println("����Ͻ� ����" + k + " �� �Դϴ�.");
				System.out.println("���� ���� �ܰ��" + mon + " �� �Դϴ�.");

				break;

			case 3:
				System.out.println("���� ���ڻ��� " + mon + " �Դϴ�.");
				System.out.println("==========================");
				break;
			}

		}

	}

}
