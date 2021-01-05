package JAVA_1211;

import java.util.Scanner;

public class 축구_게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {

			System.out.println("축구 게임을 시작합니다.");
			System.out.println("|         |         |         |");
			System.out.println("|    1    |    2    |    3    |");
			System.out.println("|         |  (-;-)  |         |");
			System.out.println("|         |----|----|         |");
			System.out.println("|    4    |  .-5-.  |    6    |");
			System.out.println("|         |  |   |  |         |");
			System.out.println("=================================");
			System.out.println("플레이어는 (1,2,3)중 막으실 곳을 선택해주세요");
			int pick = sc.nextInt();
			if (pick == 3) {
				System.out.println("플레이어가 막으실 곳은" + pick + " 입니다.");
				System.out.println("|         |         |         |");
				System.out.println("|    1    |    2    |    3    |");
				System.out.println("|         |         |  (-;-)  |");
				System.out.println("|         |         |----|----|");
				System.out.println("|    4    |    5    |  .-6-.  |");
				System.out.println("|         |         |  |   |  |");
				System.out.println("=================================");
			}
			if (pick == 2) {
				System.out.println("플레이어가 막으실 곳은" + pick + " 입니다.");
				System.out.println("|         |         |         |");
				System.out.println("|    1    |    2    |    3    |");
				System.out.println("|         |  (-;-)  |         |");
				System.out.println("|         |----|----|         |");
				System.out.println("|    4    |  .-5-.  |    6    |");
				System.out.println("|         |  |   |  |         |");
				System.out.println("=================================");
			}

			if (pick == 1) {
				System.out.println("플레이어가 막으실 곳은" + pick + " 입니다.");
				System.out.println("|         |         |         |");
				System.out.println("|    1    |    2    |    3    |");
				System.out.println("|  (-;-)  |         |         |");
				System.out.println("|----|----|         |         |");
				System.out.println("|  .-4-.  |    5    |    6    |");
				System.out.println("|  |   |  |         |         |");
				System.out.println("=================================");

			}
			System.out.println("선택하신 곳이 맞습니까? (예 아니요)중 입력하세요");
			String str = sc.next();
			int rdm = (int) (Math.random() * 6) + 1;
			switch (str) {
			case ("예"):
				System.out.println("키커가 공을 찹니다 방향은" + rdm + " 방향입니다.");
				System.out.println("=================================");

				if (rdm == pick) {
					if (rdm == 1) {
						System.out.println("슛을 막았습니다.");
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
							System.out.println("슛을 막았습니다.");
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
								System.out.println("슛을 막았습니다.");
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
						System.out.println("슛을 막았습니다.");
						System.out.println("|         |         |         |");
						System.out.println("|****1****|    2    |    3    |");
						System.out.println("| |(^;^)| |         |         |");
						System.out.println("| '--|--' |         |         |");
						System.out.println("|  .-4-.  |    5    |    6    |");
						System.out.println("|  |   |  |         |         |");
						System.out.println("=================================");
						run = false;

					} else {
						System.out.println(" 방향은 같았으나 슛을 막지 못했습니다.");
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
						System.out.println("슛을 막았습니다.");
						System.out.println("|         |         |         |");
						System.out.println("|    1    |****2****|    3    |");
						System.out.println("|         | |(^;^)| |         |");
						System.out.println("|         | '--|--' |         |");
						System.out.println("|    4    |  .-5-.  |    6    |");
						System.out.println("|         |  |   |  |         |");
						System.out.println("=================================");
						run = false;

					} else {
						System.out.println(" 방향은 같았으나 슛을 막지 못했습니다.");

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
						System.out.println("슛을 막았습니다.");
						System.out.println("|         |         |         |");
						System.out.println("|    1    |    2    |****3****|");
						System.out.println("|         |         | |(^;^)| |");
						System.out.println("|         |         | '--|--' |");
						System.out.println("|    4    |    5    |  .-6-.  |");
						System.out.println("|         |         |  |   |  |");
						System.out.println("=================================");
						run = false;

					} else {
						System.out.println(" 방향은 같았으나 슛을 막지 못했습니다.");
						System.out.println("|         |         |  GOLL!  |");
						System.out.println("|    1    |    2    |;;;;3;;;;|");
						System.out.println("|         |         |  (-;-)  |");
						System.out.println("|         |         |----|----|");
						System.out.println("|    4    |    5    |  .-6-.  |");
						System.out.println("|         |         |  |   |  |");
						System.out.println("=================================");

					}
				}else if(rdm!=pick) {
					System.out.println("슛이 날아오는 곳을 예측하지 못했습니다.");
					
				}

			}
		}
		System.out.println("슛을 막아 게임이 종료됩니다.");
		System.out.println("=================================");

	}

}
