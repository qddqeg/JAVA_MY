package 시험;
import java.util.Random;
import java.util.Scanner;
public class Coding_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rd=new Random();
		System.out.println("정수를 입력하세요.");
		int num=sc.nextInt();
		int sum=0;
          for(int i=1;i<=num;i++) {
        	  sum+=i;
        	  
          }
          System.out.println(sum);
          int rdm=rd.nextInt(10)+1;
          int result=sum*rdm;
          System.out.println(rdm);
          System.out.println("정답은 : "+result);
	}

}
