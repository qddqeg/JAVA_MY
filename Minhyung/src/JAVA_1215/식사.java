package JAVA_1215;
import java.util.Scanner;
public class 식사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        boolean run= true;
        int money=0;
        while(run) {
        	  System.out.println("분식 메뉴를 선택해주세요.");
              System.out.println("|1. 라면| |2. 오뎅| |3. 떡볶이| |4. 순대| |5. 계산|");
              int pick=sc.nextInt();
              money += menu(pick);
              
              if(pick==5) {
            	  System.out.println("계산 금액은 : "+money+" 원 입니다.");
            	  run=false;
              }
        }
      
        
	}
  public static int menu(int seq) {
	  int money=0;
	  switch(seq) {
	  case 1:
		  System.out.println("라면을 선택하셨습니다.");
		int Ramen=3000;
		  money+=Ramen;
		  break;
		  
	  case 2:
		  System.out.println("오뎅을 선택하셨습니다.");
		  int Fish_cake =1500;
		  money+=Fish_cake;
		  break;
		  
	  case 3:
		  System.out.println("떡볶이를 선택하셨습니다.");
		  int Tteokbokki =3000;
		  money+=Tteokbokki;
		  break;
		  
	  case 4:
		  System.out.println("순대를 선택하셨습니다.");
		  int Sundae =1500;
		  money+=Sundae;
		  break;
		  
	  }
	  
	  return money;
  }
}
