package 클라우드스터딩;
import java.util.Scanner;
public class ex_8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("세자리 숫자를 입력하세요");
		int num=sc.nextInt();
		System.out.println("입력하신 숫자는 "+num);
		
		 int num_1=num%10;
         int num_2=num/10;
         
         int num_3=num_2%10;
         int num_4=num_2/10;
         
         int sum=num_1+num_3+num_4;
         System.out.println(num_4+" + "+num_3+" + "+num_1+" = "+sum+ " 입니다.");
	}

}
