package JAVA_1229;

import java.util.Scanner;

public class ATM_main {
	static int pick;
	static boolean bo = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM money= new ATM();
		
		
		int pick;
		System.out.println("ATM�� ���Ű� ȯ���մϴ� ����Ͻ� ������ ������ �ּ���.");
		while (bo) {
			System.out.println("====================================");
			System.out.println("| 1. �Ա� | 2. ��� | 3. ��ȸ | 4. ���� |");
			System.out.println("====================================");
			pick = sc.nextInt();

			switch (pick) {
			case 1:
				deposit(money);
				break;

			case 2:
				withdraw(money);

				break;

			case 3:
				Lookup(money);
				break;
			case 4:
				ESC();
				break;
			}

		}

	}
	public static void deposit(ATM money) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���");
         pick = sc.nextInt();
         money.money+=pick;
		
	}
	public static void withdraw(ATM money) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ���");
        pick = sc.nextInt();
        if(money.money<pick) {
        	System.out.println("�ܾ� ����");
        }else {
        	money.money-=pick;
        }
	}
	public static void Lookup(ATM money) {
		System.out.println("�ܾ��� ��ȸ �մϴ�");
		System.out.println("====================================");
		System.out.println("���� ���� �ݾ��� : "+money.money+" �� �Դϴ�.");

	}
	public static void ESC() {
		System.out.println("�ȳ��� ������!"); 
		bo=false;
	}

}
