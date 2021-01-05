package JAVA_1215;
import java.util.Scanner;
public class 메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("숫자를 입력하세요.");
       int num_1=sc.nextInt();
       System.out.println("숫자를 입력하세요.");
       int num_2=sc.nextInt();
       int sum=plus(num_1,num_2);
       System.out.println(sum);
       
	}
  public static int plus(int num_1,int num_2) {
	  int sum= num_1+num_2;
	  int sum_1=minus(sum);
	  return sum_1;
	  
  }
  public static int minus(int sum) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("숫자를 입력하세요.");
	  int num_3=sc.nextInt();
	  int sum_1=sum-num_3;
	  
	  return sum_1;
	  
  }
}
