package Coding;
import java.util.Random;
import java.util.Scanner;

public class Coding_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i = sc.nextInt();
		int j = 0;
		int x = 0;
		
		for(j=0; j<=i; j++) {
			x+=j;
		}
		System.out.println("�Է��� �� ������ �� : " +x);
		Random rd = new Random();
		int y = rd.nextInt(10);	
		System.out.println("������ : "+y);
		System.out.println("����� :"+x*y);		
	}

}
