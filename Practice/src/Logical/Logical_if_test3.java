package Logical;
import java.util.Scanner;
import java.util.Random;


public class Logical_if_test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i = sc.nextInt();
		System.out.println("�Է°��� :"+i);
		
		if(i >= 900) {
			if(i >= 1000) {
				System.out.println("���ָ���");
			}else {
				System.out.println("����");
			}
		}
		else if( i >= 800) {
			if( i >= 850) {
				System.out.println("���ݸ���");
			}else {
				System.out.println("���ξ���");
			}
		}
	}
}
