package JAVA_1203;

import java.util.Scanner;

public class string_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int monster = 100;
		
		System.out.println("직업을 선택하세요.");
		System.out.println("1_전사 2_앨프 3_마법사"); //직업 고르는 곳
		int 힘 = 0;                              
		String 직업 ="";
		int job_num1 = sc.nextInt();
		switch(job_num1) {
		case 1:
			직업 ="전사";
			힘=10;
	       break;
		case 2:
			직업 ="앨프";
			힘=8;
			break;
		case 3:
			직업 ="마법사";
			힘=6;
			break;
		}
		
		
		System.out.println(직업 + "선택하셨습니다. 공격력에 "+힘+ "이 추가됩니다.");
		
		
		
		
		
		
		
		
		
		
		

		System.out.println("무기를 선택하세요."); //무기 고르는곳 
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

	
		
		System.out.println("공격하시겠습니까?");
		System.out.println("1.공격  2.방어");
		int i = sc.nextInt();
		if (i == 1) {
			double dice_8d = (Math.random() * 8) + 1;
			int dice_8 = (int) dice_8d;

			if (dice_8 >= 4) {
				attk=attk+(힘/2);
				System.out.println("공격에 성공하셨습니다.");
				System.out.println(직업 + "힘 보정으로 공격력에" + (힘/2)+"가 추가됩니다.");
				System.out.println(Weapon + "로" + attk + "데미지를 주었습니다");
				

			} else if (dice_8 < 4) {
				System.out.println("공격에 실패하셨습니다.");
			}
		if (i == 2) {
			double dice_8c = (Math.random() * 8) + 1;
			int dice_8x = (int) dice_8c;
			
			if (dice_8x >= 4) {
				System.out.println("방어에 성공하셨습니다.");

			} else if (dice_8x < 4) {
				System.out.println("방어에 실패하셨습니다.");
				
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
