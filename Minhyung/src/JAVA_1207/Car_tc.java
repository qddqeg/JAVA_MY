package JAVA_1207;

import java.io.IOException;
import java.util.Scanner;

public class Car_tc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean car_select = true;
		int car_select_flag = 0;
		boolean car_run = true;
		int car_run_flag = 0;
		String car_name = "";
		int speed = 0;
		int acc_speed = 0;
		int break_speed = 0;
		int max_speed = 0;

		while (car_select) {
			System.out.println(" ������ ������ �ּ���  1. ������      2. ����     3. �ҳ�Ÿ");
			int car_num = sc.nextInt();

			switch (car_num) {
			case 1:
				car_name = "������";
				acc_speed = 10;
				break_speed = 10;
				max_speed = 300;
				break;

			case 2:
				car_name = "����";
				acc_speed = 8;
				break_speed = 8;
				max_speed = 250;
				break;

			case 3:
				car_name = "������";
				acc_speed = 5;
				break_speed = 5;
				max_speed = 200;
				break;
			}

			System.out.println(car_name + " �� �����ϼ̳׿�.");
			System.out.println(car_name + "�� ��� �����Ͻðڽ��ϱ�?  1. YES   2. NO");
			car_select_flag = sc.nextInt();
			switch (car_select_flag) {
			case 1:
				car_select = false;
				break;
			case 2:
				car_select = true;
				break;
			}
		}

		while (car_run) {
			System.out.println("----------------------------------------");
			System.out.println("��� �Ͻðڽ��ϱ�?  (1. ����,  2. ����");
			int status = sc.nextInt();
			switch (status) {
			case 1:
				speed = speed + acc_speed;
				if (speed > max_speed) {
					System.out.println("�� �̻� �ӵ��� �ø� �� �����ϴ�.");
					speed = max_speed;
					System.out.println("���� �ӵ��� " + speed);
				}else {
				System.out.println("���� �ӵ��� " + speed);
				}
				break;

			case 2:
				speed = speed - break_speed;
			
				if (speed <= 0) {
					System.out.println("���� ���� �Ͽ����ϴ�.");
					speed = 0;
				}else {
					System.out.println("���� �ӵ��� " + speed);
				}
				break;
			}
		}
	}
}
