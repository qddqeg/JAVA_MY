package JAVA_1229;

import java.util.Scanner;

public class Record {
	static int[] kors = new int[3];
	static float avg;
	static int total = 0;
	public static void main(String[] args) {

		

		
		
		int menu;
		boolean keepLoop = true;

		Scanner scan = new Scanner(System.in);

		while (keepLoop) {
			menu=menu_input();
			switch (menu) {
			case 1:
				Record_input();
				break;
			case 2:
				 Record_output();
				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ� 1~3 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public static void Record_input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         ���� �Է�                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("����%d : ", i + 1);
				kors[i] = scan.nextInt();

				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");

			} while (kors[i] < 0 || 100 < kors[i]);

		System.out.println("----------------------------------------------------------");

		
	}
	public static void Record_output() {
		for (int i = 0; i < 3; i++)
			total += kors[i];

		avg = total / 3.0f;

		System.out.println("----------------------------------------------------------");
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.printf("���� %d : %3d\n", 3 - i, kors[i]);

		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");

	}
	public static int menu_input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         ���� �޴�                   | ");
		System.out.println("----------------------------------------------------------");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();
		
		return menu;

	}
}
