package Logical;
import java.util.Scanner;
import java.util.Random;

public class Logical_if_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		String grade;
		if(score >= 101) {
			System.out.println("�߸��� �����Դϴ�.");
		}
		else if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
			System.out.println("����� ������"+grade+"�Դϴ�");
		}else if(score >= 80){
			if(score >= 85) {
				grade = "B+";
			}else{
				grade = "B";
			}
			System.out.println("����� ������"+grade+"�Դϴ�");
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	
	}

}
