package JAVA_1214;
import java.util.Scanner;
public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("������ ����Ͻðڽ��ϱ�?");
       int pick=sc.nextInt();
       int array[]=new int[pick];
       for(int i=0;i<pick;i++) {
    	   System.out.println("���ڸ� �Է��ϼ���");
    	   int num=array[i];
    	   array[i]=sc.nextInt();
    	   
       }
      System.out.println("�����ڸ� �Է����ּ���.");
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