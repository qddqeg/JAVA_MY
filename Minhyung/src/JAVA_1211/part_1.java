package JAVA_1211;
import java.util.Scanner;
public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       System.out.println("������ ���ðڽ��ϱ�?");
       
       int pick =sc.nextInt();
       int num[] =new int[pick];
       int sum=0;
       int i=0;
      for(i=0; i<pick; i++) {
    	  System.out.println(i+1+"��° ���ڸ� �Է����ּ���.");
    	  num[i]=sc.nextInt();
    	  System.out.println("�����ڸ� �Է����ּ���.");
          String str= sc.next();
          switch(str) {
          case("+"):sum+=num[i];  System.out.println(sum);
          break;
          case("-"):sum-=num[i];  System.out.println(sum);
          break;
          case("*"):sum*=num[i];  System.out.println(sum);
          break;
          case("/"):sum/=num[i];  System.out.println(sum);
          break;
          }
    	  
      }
      
     
      
      }
	}


