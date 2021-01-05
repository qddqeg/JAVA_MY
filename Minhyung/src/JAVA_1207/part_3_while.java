package JAVA_1207;
import java.util.Scanner;
public class part_3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        boolean run=true;
        
        while(run) {
        	System.out.println("===============================");
        	System.out.println("필요하신 단을 입력해주세요.");
        	int dan = sc.nextInt();
        	int i = 0;
        	   for(i=1; i<=9; i++) { 
        		   int j =dan*i;
        				   System.out.println(dan+" x "+i+" = "+j+" 입니다.");
        		   
        	   }
        	 System.out.println("계속 단을 입력하시겠습니까?");
        	 System.out.println(" 예   아니요 로 입력해주세요.");
        	 String str = sc.next();
        	 
        	 switch(str) {
        	 
        	 case("아니요"):
        		 System.out.println("구구단 프로그램을 종료합니다.");
        	     run=false;
        	 }
        }
        
	}

}
