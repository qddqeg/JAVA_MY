package JAVA_1207;
import java.util.Scanner;
public class part_3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        boolean run=true;
        
        while(run) {
        	System.out.println("===============================");
        	System.out.println("�ʿ��Ͻ� ���� �Է����ּ���.");
        	int dan = sc.nextInt();
        	int i = 0;
        	   for(i=1; i<=9; i++) { 
        		   int j =dan*i;
        				   System.out.println(dan+" x "+i+" = "+j+" �Դϴ�.");
        		   
        	   }
        	 System.out.println("��� ���� �Է��Ͻðڽ��ϱ�?");
        	 System.out.println(" ��   �ƴϿ� �� �Է����ּ���.");
        	 String str = sc.next();
        	 
        	 switch(str) {
        	 
        	 case("�ƴϿ�"):
        		 System.out.println("������ ���α׷��� �����մϴ�.");
        	     run=false;
        	 }
        }
        
	}

}
