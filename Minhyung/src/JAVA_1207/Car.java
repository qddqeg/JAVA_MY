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
		System.out.println("자동차를 선택해주세요");
		System.out.println("1. 쏘나타  2. 포르쉐  3. 벤츠");
		int car = sc.nextInt();

		switch (car) {
		case 1:
			while (run) {
				System.out.println("===========================");
				System.out.println("쏘나타 자동차의 속도는 " + SONTA_speed + " km 입니다. ");
				System.out.println("1.가속(+5km)    2.감속(-5km)     3.중지 ");
				int i = sc.nextInt();

				switch (i) {
				case 1:
					SONTA_speed += 5;

					if (SONTA_speed > 200) {
						System.out.println("더이상 속도를 올릴수 없습니다.");
						SONTA_speed -= 5;
					}

					break;

				case 2:
					SONTA_speed -= 5;

					if (SONTA_speed < 0) {
						System.out.println("차가 정지합니다.");
						SONTA_speed += 5;
					}

					break;

				case 3:
					System.out.println("차량 운행을 종료합니다.");
					run = false;
					break;
				}
			}
			break;
		case 2:
			while (run) {
				System.out.println("===========================");
				System.out.println("포르쉐 자동차의 속도는 " + Porchee_speed + " km 입니다. ");
				System.out.println("1.가속(+10km)    2.감속(-10km)   3.중지");
				int i = sc.nextInt();

				switch (i) {
				case 1:

					Porchee_speed += 10;

					if (Porchee_speed > 300) {
						System.out.println("더이상 속도를 올릴수 없습니다.");
						Porchee_speed -= 10;
					}

					break;

				case 2:

					Porchee_speed -= 10;

					if (Porchee_speed < 0) {
						System.out.println("차가 정지합니다.");
						Porchee_speed += 10;
					}

					break;

				case 3:
					System.out.println("차량 운행을 종료합니다.");
					run = false;

				}
			}
			break;
		case 3:
			while (run) {
				System.out.println("===========================");
				System.out.println("벤츠 의 속도는 " + Benz_speed + " km 입니다. ");
				System.out.println("1.가속(+10km)    2.감속(-10km)   3.중지");
				int i = sc.nextInt();

				switch (i) {
				case 1:

					Benz_speed += 10;

					if (Benz_speed > 250) {
						System.out.println("더이상 속도를 올릴수 없습니다.");
						Benz_speed -= 8;
					}

					break;

				case 2:

					Benz_speed -= 8;

					if (Benz_speed < 0) {
						System.out.println("차가 정지합니다.");
						Benz_speed += 8;
					}

					break;

				case 3:
					System.out.println("차량 운행을 종료합니다.");
					run = false;
					break;
				}
			}
			break;

		}

	}

}
