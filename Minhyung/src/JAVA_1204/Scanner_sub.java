package JAVA_1204;

import java.util.Scanner;

public class Scanner_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {                                   // ���� �ϳ��� �ڸ��� ����
			String sub = str.substring(i, i + 1);
			System.out.println(sub);

			if (sub.equals("#") || sub.equals("!") || sub.equals("?")) {      // �߸� �Է��Ѱ�

				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} else {                                                       // �������� ���� �Է��� ��
				System.out.println("���������� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
