package JAVA_1214;
import java.util.Scanner;
public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("몇항을 계산하시겠습니까?");
       int pick=sc.nextInt();
       int array[]=new int[pick];
       for(int i=0;i<pick;i++) {
    	   System.out.println("숫자를 입력하세요");
    	   int num=array[i];
    	   array[i]=sc.nextInt();
    	   
       }
      System.out.println("연산자를 입력해주세요.");
      String str=sc.next();
      int sum=0;
      switch(str) {
      case("+"):
    	  for(int i=0;i<pick;i++) {
    		  sum=plus(sum,array[i]);
    	}
          System.out.println(sum);
      case("-"):
    	  for(int i=0; i<pick;i++) {
    		  sum=minus(i,sum,array[i]);
    	  }
          
      }
       
	}
      
	
	public static int plus(int sum,int array) {
    	  sum+=array;
	     return sum;
  }
	public static int minus(int i,int sum, int array) {
		
		
		return sum;
	}
}
