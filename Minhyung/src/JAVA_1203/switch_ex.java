package JAVA_1203;
import java.util.Scanner;
public class switch_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		int monster = 100;

		System.out.println("무기를 선택하세요.");
		System.out.println("1_Sword 2_Axe 3_Hammer");
		String Weapon = "";
		int attk = 0;
		int Weapon_num = sc.nextInt();
		
		switch(Weapon_num) {
		case 1:
			Weapon ="SWORD";
			attk = 10;
			break;
			
		case 2:
			Weapon ="AXE";
			attk = 11;
			break;
			
			
		case 3:
			Weapon ="Hammer";
			attk = 12;
			break;
			
			
		default:
			Weapon ="주먹";
			attk = 1;
			
		}
		
		System.out.println("현재 선택된 무기는 :"+Weapon+"입니다.");
		System.out.println("현재 선택된 무기의 공격력은 :"+attk+"입니다");
      
	}

}
