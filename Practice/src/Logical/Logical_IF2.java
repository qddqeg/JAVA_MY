package Logical;
import java.util.Scanner;

public class Logical_IF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��ϼ���");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("������ 90������ �����ϴ�.");
			System.out.println("AŬ���� �Դϴ�.");
		}else {
			System.out.println("������ 90������ �����ϴ�.");
			System.out.println("BŬ���� �Դϴ�.");			
		}
	}

}
