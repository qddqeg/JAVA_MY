package JAVA_1211;

import java.util.Scanner;

public class �౸_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {

			System.out.println("�౸ ������ �����մϴ�.");
			System.out.println("|         |         |         |");
			System.out.println("|    1    |    2    |    3    |");
			System.out.println("|         |  (-;-)  |         |");
			System.out.println("|         |----|----|         |");
			System.out.println("|    4    |  .-5-.  |    6    |");
			System.out.println("|         |  |   |  |         |");
			System.out.println("=================================");
			System.out.println("�÷��̾�� (1,2,3)�� ������ ���� �������ּ���");
			int pick = sc.nextInt();
			if (pick == 3) {
				System.out.println("�÷��̾ ������ ����" + pick + " �Դϴ�.");
				System.out.println("|         |         |         |");
				System.out.println("|    1    |    2    |    3    |");
				System.out.println("|         |         |  (-;-)  |");
				System.out.println("|         |         |----|----|");
				System.out.println("|    4    |    5    |  .-6-.  |");
				System.out.println("|         |         |  |   |  |");
				System.out.println("=================================");
			}
			if (pick == 2) {
				System.out.println("�÷��̾ ������ ����" + pick + " �Դϴ�.");
				System.out.println("|         |         |         |");
				System.out.println("|    1    |    2    |    3    |");
				System.out.println("|         |  (-;-)  |         |");
				System.out.println("|         |----|----|         |");
				System.out.println("|    4    |  .-5-.  |    6    |");
				System.out.println("|         |  |   |  |         |");
				System.out.println("=================================");
			}

			if (pick == 1) {
				System.out.println("�÷��̾ ������ ����" + pick + " �Դϴ�.");
				System.out.println("|         |         |         |");
				System.out.println("|    1    |    2    |    3    |");
				System.out.println("|  (-;-)  |         |         |");
				System.out.println("|----|----|         |         |");
				System.out.println("|  .-4-.  |    5    |    6    |");
				System.out.println("|  |   |  |         |         |");
				System.out.println("=================================");

			}
			System.out.println("�����Ͻ� ���� �½��ϱ�? (�� �ƴϿ�)�� �Է��ϼ���");
			String str = sc.next();
			int rdm = (int) (Math.random() * 6) + 1;
			switch (str) {
			case ("��"):
				System.out.println("ŰĿ�� ���� ���ϴ� ������" + rdm + " �����Դϴ�.");
				System.out.println("=================================");

				if (rdm == pick) {
					if (rdm == 1) {
						System.out.println("���� ���ҽ��ϴ�.");
						System.out.println("|         |         |         |");
						System.out.println("|****1****|    2    |    3    |");
						System.out.println("| |(^;^)| |         |         |");
						System.out.println("| '--|--' |         |         |");
						System.out.println("|  .-4-.  |    5    |    6    |");
						System.out.println("|  |   |  |         |         |");
						System.out.println("=================================");
						run = false;
					}

					if (rdm == pick) {
						if (rdm == 2) {
							System.out.println("���� ���ҽ��ϴ�.");
							System.out.println("|         |         |         |");
							System.out.println("|    1    |****2****|    3    |");
							System.out.println("|         | |(^;^)| |         |");
							System.out.println("|         | '--|--' |         |");
							System.out.println("|    4    |  .-5-.  |    6    |");
							System.out.println("|         |  |   |  |         |");
							System.out.println("=================================");
							run = false;
						}

						if (rdm == pick) {
							if (rdm == 3) {
								System.out.println("���� ���ҽ��ϴ�.");
								System.out.println("|         |         |         |");
								System.out.println("|    1    |    2    |****3****|");
								System.out.println("|         |         | |(^;^)| |");
								System.out.println("|         |         | '--|--' |");
								System.out.println("|    4    |    5    |  .-6-.  |");
								System.out.println("|         |         |  |   |  |");
								System.out.println("=================================");
								run = false;
							}

						}
					}
				} else if (rdm == 4) {
					int rdm_1 = (int) (Math.random() * 2) + 1;
					if (rdm_1 == 1) {
						System.out.println("���� ���ҽ��ϴ�.");
						System.out.println("|         |         |         |");
						System.out.println("|****1****|    2    |    3    |");
						System.out.println("| |(^;^)| |         |         |");
						System.out.println("| '--|--' |         |         |");
						System.out.println("|  .-4-.  |    5    |    6    |");
						System.out.println("|  |   |  |         |         |");
						System.out.println("=================================");
						run = false;

					} else {
						System.out.println(" ������ �������� ���� ���� ���߽��ϴ�.");
						System.out.println("|  GOLL!  |         |         |");
						System.out.println("|;;;;1;;;;|    2    |    3    |");
						System.out.println("|  (-;-)  |         |         |");
						System.out.println("|----|----|         |         |");
						System.out.println("|  .-4-.  |    5    |    6    |");
						System.out.println("|  |   |  |         |         |");
						System.out.println("=================================");

					}
				} else if (rdm == 5) {
					int rdm_1 = (int) (Math.random() * 2) + 1;
					if (rdm_1 == 1) {
						System.out.println("���� ���ҽ��ϴ�.");
						System.out.println("|         |         |         |");
						System.out.println("|    1    |****2****|    3    |");
						System.out.println("|         | |(^;^)| |         |");
						System.out.println("|         | '--|--' |         |");
						System.out.println("|    4    |  .-5-.  |    6    |");
						System.out.println("|         |  |   |  |         |");
						System.out.println("=================================");
						run = false;

					} else {
						System.out.println(" ������ �������� ���� ���� ���߽��ϴ�.");

						System.out.println("|         |  GOLL!  |         |");
						System.out.println("|    1    |;;;;2;;;;|    3    |");
						System.out.println("|         |  (-;-)  |         |");
						System.out.println("|         |----|----|         |");
						System.out.println("|    4    |  .-5-.  |    6    |");
						System.out.println("|         |  |   |  |         |");
						System.out.println("=================================");
					}
				} else if (rdm == 6) {
					int rdm_1 = (int) (Math.random() * 2) + 1;
					if (rdm_1 == 1) {
						System.out.println("���� ���ҽ��ϴ�.");
						System.out.println("|         |         |         |");
						System.out.println("|    1    |    2    |****3****|");
						System.out.println("|         |         | |(^;^)| |");
						System.out.println("|         |         | '--|--' |");
						System.out.println("|    4    |    5    |  .-6-.  |");
						System.out.println("|         |         |  |   |  |");
						System.out.println("=================================");
						run = false;

					} else {
						System.out.println(" ������ �������� ���� ���� ���߽��ϴ�.");
						System.out.println("|         |         |  GOLL!  |");
						System.out.println("|    1    |    2    |;;;;3;;;;|");
						System.out.println("|         |         |  (-;-)  |");
						System.out.println("|         |         |----|----|");
						System.out.println("|    4    |    5    |  .-6-.  |");
						System.out.println("|         |         |  |   |  |");
						System.out.println("=================================");

					}
				}else if(rdm!=pick) {
					System.out.println("���� ���ƿ��� ���� �������� ���߽��ϴ�.");
					
				}

			}
		}
		System.out.println("���� ���� ������ ����˴ϴ�.");
		System.out.println("=================================");

	}

}
