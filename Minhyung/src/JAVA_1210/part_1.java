package JAVA_1210;

import java.util.Scanner;

public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("야구 게임을 시작하겠습니다.");
		System.out.println("당신은 타자입니다. 투수가 어디로 던질지 예측하여 지정해주세요.");
		boolean run = true;
		int cont = 0;
		while (run) {
			System.out.println("              |1|2|3|");
			System.out.println("              |4|5|6|");
			System.out.println("              |7|8|9|");
			int pick_1 = sc.nextInt();// 내가 칠 위치 지정

			int Pitcher = (int) (Math.random() * 9) + 1; // 투수가 던질 위치지정
			int rdm = (int) (Math.random() * 50) + 100; // 투수가 던진 공의 속도
			if (rdm >= 110) {
				System.out.println("투수가 " + Pitcher + " 번 위치로 시속 " + rdm + " km 에 해당하는 공을 던졌다.");
				if (Pitcher == pick_1) {
					System.out.println("        안타입니다.");
				} else {
					System.out.println("            헛스윙!!");
					cont++;
					System.out.println("        " + cont + " 스트라이크!");
					if (cont == 3) {
						System.out.println("          삼진아웃!!");
						run = false;
					}

				}
			}else if(rdm < 110){
				System.out.println("투수가 " + Pitcher + " 번 위치로 시속 " + rdm + " km 에 해당하는 공을 던졌다.");
				if (Pitcher == pick_1) {
					System.out.println("##########홈런##########");
					run = false;
				} else {
					System.out.println("            헛스윙!!");
					cont++;
					System.out.println("        " + cont + " 스트라이크!");
					if (cont == 3) {
						System.out.println("          삼진아웃!!");
						run = false;
					}

				}
			}
		}

	}

}
