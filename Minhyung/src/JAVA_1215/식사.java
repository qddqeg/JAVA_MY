package JAVA_1215;
import java.util.Scanner;
public class �Ļ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        boolean run= true;
        int money=0;
        while(run) {
        	  System.out.println("�н� �޴��� �������ּ���.");
              System.out.println("|1. ���| |2. ����| |3. ������| |4. ����| |5. ���|");
              int pick=sc.nextInt();
              money += menu(pick);
              
              if(pick==5) {
            	  System.out.println("��� �ݾ��� : "+money+" �� �Դϴ�.");
            	  run=false;
              }
        }
      
        
	}
  public static int menu(int seq) {
	  int money=0;
	  switch(seq) {
	  case 1:
		  System.out.println("����� �����ϼ̽��ϴ�.");
		int Ramen=3000;
		  money+=Ramen;
		  break;
		  
	  case 2:
		  System.out.println("������ �����ϼ̽��ϴ�.");
		  int Fish_cake =1500;
		  money+=Fish_cake;
		  break;
		  
	  case 3:
		  System.out.println("�����̸� �����ϼ̽��ϴ�.");
		  int Tteokbokki =3000;
		  money+=Tteokbokki;
		  break;
		  
	  case 4:
		  System.out.println("���븦 �����ϼ̽��ϴ�.");
		  int Sundae =1500;
		  money+=Sundae;
		  break;
		  
	  }
	  
	  return money;
  }
}
