package JAVA_1203;
import java.util.Scanner;
public class 연숩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int 몬스터_hp = 100;
        System.out.println("몬스터의 HP는"+ 몬스터_hp+"입니다.");
        
        
        System.out.println("무기를 선택해주세요.");//무기선택
        System.out.println("1.검  2.도끼  3.활");
        String 무기이름 = "";
        int 무기 = sc.nextInt();
        int 공격력 =0;
        
        switch(무기) {
        
        case 1 : 
        	무기이름="검";
        	공격력 = 10;
        	break;
        	
        	
        case 2 :
        	무기이름 ="도끼";
        	공격력 = 13;
        	break;
        	
        	
        case 3 : 
        	무기이름 ="활";
        	공격력 = 8;
        	break;
        	
        default :
        	무기이름 ="주먹";
        	공격력 = 1;
        	
        	
        }
        System.out.println(무기이름);
        System.out.println(공격력);
        	
        
        
        
	}

}
