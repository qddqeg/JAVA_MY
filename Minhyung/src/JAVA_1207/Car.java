package JAVA_1207;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int SONTA_speed = 0;
		int Porchee_speed = 0;
		int Benz_speed = 0;
		System.out.println("�ڵ����� �������ּ���");
		System.out.println("1. �Ÿ  2. ������  3. ����");
		int car = sc.nextInt();

		switch (car) {
		case 1:
			while (run) {
				System.out.println("===========================");
				System.out.println("�Ÿ �ڵ����� �ӵ��� " + SONTA_speed + " km �Դϴ�. ");
				System.out.println("1.����(+5km)    2.����(-5km)     3.���� ");
				int i = sc.nextInt();

				switch (i) {
				case 1:
					SONTA_speed += 5;

					if (SONTA_speed > 200) {
						System.out.println("���̻� �ӵ��� �ø��� �����ϴ�.");
						SONTA_speed -= 5;
					}

					break;

				case 2:
					SONTA_speed -= 5;

					if (SONTA_speed < 0) {
						System.out.println("���� �����մϴ�.");
						SONTA_speed += 5;
					}

					break;

				case 3:
					System.out.println("���� ������ �����մϴ�.");
					run = false;
					break;
				}
			}
			break;
		case 2:
			while (run) {
				System.out.println("===========================");
				System.out.println("������ �ڵ����� �ӵ��� " + Porchee_speed + " km �Դϴ�. ");
				System.out.println("1.����(+10km)    2.����(-10km)   3.����");
				int i = sc.nextInt();

				switch (i) {
				case 1:

					Porchee_speed += 10;

					if (Porchee_speed > 300) {
						System.out.println("���̻� �ӵ��� �ø��� �����ϴ�.");
						Porchee_speed -= 10;
					}

					break;

				case 2:

					Porchee_speed -= 10;

					if (Porchee_speed < 0) {
						System.out.println("���� �����մϴ�.");
						Porchee_speed += 10;
					}

					break;

				case 3:
					System.out.println("���� ������ �����մϴ�.");
					run = false;

				}
			}
			break;
		case 3:
			while (run) {
				System.out.println("===========================");
				System.out.println("���� �� �ӵ��� " + Benz_speed + " km �Դϴ�. ");
				System.out.println("1.����(+10km)    2.����(-10km)   3.����");
				int i = sc.nextInt();

				switch (i) {
				case 1:

					Benz_speed += 10;

					if (Benz_speed > 250) {
						System.out.println("���̻� �ӵ��� �ø��� �����ϴ�.");
						Benz_speed -= 8;
					}

					break;

				case 2:

					Benz_speed -= 8;

					if (Benz_speed < 0) {
						System.out.println("���� �����մϴ�.");
						Benz_speed += 8;
					}

					break;

				case 3:
					System.out.println("���� ������ �����մϴ�.");
					run = false;
					break;
				}
			}
			break;

		}

	}

}
