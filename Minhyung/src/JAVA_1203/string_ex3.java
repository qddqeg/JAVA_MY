package JAVA_1203;

import java.util.Scanner;

public class string_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int monster = 100;
		
		System.out.println("������ �����ϼ���.");
		System.out.println("1_���� 2_���� 3_������"); //���� ���� ��
		int �� = 0;                              
		String ���� ="";
		int job_num1 = sc.nextInt();
		switch(job_num1) {
		case 1:
			���� ="����";
			��=10;
	       break;
		case 2:
			���� ="����";
			��=8;
			break;
		case 3:
			���� ="������";
			��=6;
			break;
		}
		
		
		System.out.println(���� + "�����ϼ̽��ϴ�. ���ݷ¿� "+��+ "�� �߰��˴ϴ�.");
		
		
		
		
		
		
		
		
		
		
		

		System.out.println("���⸦ �����ϼ���."); //���� ���°� 
		System.out.println("1_Sword 2_Axe 3_Hammer");
		String Weapon = "";
		int attk = 0;
		int Weapon_num = sc.nextInt();

		if (Weapon_num == 1) {
			Weapon = "Sword";
			attk = 10;
		} else if (Weapon_num == 2) {
			Weapon = "Axe";
			attk = 12;

		} else if (Weapon_num == 3) {
			Weapon = "Hammer";
			attk = 15;
		}

	String a = "Sword"; // 10
	String b = "Axe"; // 12	
	String c = "Hammer"; // 15

	
		
		System.out.println("�����Ͻðڽ��ϱ�?");
		System.out.println("1.����  2.���");
		int i = sc.nextInt();
		if (i == 1) {
			double dice_8d = (Math.random() * 8) + 1;
			int dice_8 = (int) dice_8d;

			if (dice_8 >= 4) {
				attk=attk+(��/2);
				System.out.println("���ݿ� �����ϼ̽��ϴ�.");
				System.out.println(���� + "�� �������� ���ݷ¿�" + (��/2)+"�� �߰��˴ϴ�.");
				System.out.println(Weapon + "��" + attk + "�������� �־����ϴ�");
				

			} else if (dice_8 < 4) {
				System.out.println("���ݿ� �����ϼ̽��ϴ�.");
			}
		if (i == 2) {
			double dice_8c = (Math.random() * 8) + 1;
			int dice_8x = (int) dice_8c;
			
			if (dice_8x >= 4) {
				System.out.println("�� �����ϼ̽��ϴ�.");

			} else if (dice_8x < 4) {
				System.out.println("�� �����ϼ̽��ϴ�.");
				
			}

			
		
		if (Weapon.equals(a)) {
			monster = monster - 10;
		} else if (Weapon.equals(b)) {
			monster = monster - 12;

		} else if (Weapon.equals(c)) {
			monster = monster - 15;

			}
			System.out.println(monster);
		}

	}
	}
}
