package JAVA_1210;

import java.util.Scanner;

public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�߱� ������ �����ϰڽ��ϴ�.");
		System.out.println("����� Ÿ���Դϴ�. ������ ���� ������ �����Ͽ� �������ּ���.");
		boolean run = true;
		int cont = 0;
		while (run) {
			System.out.println("              |1|2|3|");
			System.out.println("              |4|5|6|");
			System.out.println("              |7|8|9|");
			int pick_1 = sc.nextInt();// ���� ĥ ��ġ ����

			int Pitcher = (int) (Math.random() * 9) + 1; // ������ ���� ��ġ����
			int rdm = (int) (Math.random() * 50) + 100; // ������ ���� ���� �ӵ�
			if (rdm >= 110) {
				System.out.println("������ " + Pitcher + " �� ��ġ�� �ü� " + rdm + " km �� �ش��ϴ� ���� ������.");
				if (Pitcher == pick_1) {
					System.out.println("        ��Ÿ�Դϴ�.");
				} else {
					System.out.println("            �꽺��!!");
					cont++;
					System.out.println("        " + cont + " ��Ʈ����ũ!");
					if (cont == 3) {
						System.out.println("          �����ƿ�!!");
						run = false;
					}

				}
			}else if(rdm < 110){
				System.out.println("������ " + Pitcher + " �� ��ġ�� �ü� " + rdm + " km �� �ش��ϴ� ���� ������.");
				if (Pitcher == pick_1) {
					System.out.println("##########Ȩ��##########");
					run = false;
				} else {
					System.out.println("            �꽺��!!");
					cont++;
					System.out.println("        " + cont + " ��Ʈ����ũ!");
					if (cont == 3) {
						System.out.println("          �����ƿ�!!");
						run = false;
					}

				}
			}
		}

	}

}
