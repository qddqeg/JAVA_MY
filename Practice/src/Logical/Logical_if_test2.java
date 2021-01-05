package Logical;
import java.util.Scanner;
import java.util.Random;

public class Logical_if_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		String grade;
		if(score >= 101) {
			System.out.println("잘못된 점수입니다.");
		}
		else if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
			System.out.println("당신의 학점은"+grade+"입니다");
		}else if(score >= 80){
			if(score >= 85) {
				grade = "B+";
			}else{
				grade = "B";
			}
			System.out.println("당신의 학점은"+grade+"입니다");
		}else {
			System.out.println("잘못된 점수입니다.");
		}
	
	}

}
