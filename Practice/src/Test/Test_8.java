package Test;

import java.util.Scanner;
public class Test_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int k = sc.nextInt();
		
		int i = k/1000;
		int j = k/500;
		int l = k/100;
		int o = k%100;
		System.out.println("1000�� ¥�� : "+i+"��");
		System.out.println("500�� ¥�� : "+j+"��");
		System.out.println("100�� ¥�� : "+l+"��");
		System.out.println("������ :  "+o);
	}

}
