package Test;

import java.util.Scanner;
public class Test_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		int i = sc.nextInt();
		
		int i_1000 = i/1000;
		int i_500 = i%1000/500;
		int i_100 = i%500/100;
		int i_x = i%100;
		System.out.println("1000��¥�� : "+i_1000+"��");
		System.out.println("500��¥�� : "+i_500+"��");
		System.out.println("100��¥�� : "+i_100+"��");
		System.out.println("������ : "+i_x);
		
		

		
		
		
	}

}
