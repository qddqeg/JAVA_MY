package Ŭ���彺�͵�;
import java.util.Scanner;
public class ex_8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���ڸ� ���ڸ� �Է��ϼ���");
		int num=sc.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� "+num);
		
		 int num_1=num%10;
         int num_2=num/10;
         
         int num_3=num_2%10;
         int num_4=num_2/10;
         
         int sum=num_1+num_3+num_4;
         System.out.println(num_4+" + "+num_3+" + "+num_1+" = "+sum+ " �Դϴ�.");
	}

}
