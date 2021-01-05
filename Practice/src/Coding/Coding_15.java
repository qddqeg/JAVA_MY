package Coding;
import java.util.Random;
import java.util.Scanner;

public class Coding_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i = sc.nextInt();
		int j = 0;
		int x = 0;
		
		for(j=0; j<=i; j++) {
			x+=j;
		}
		System.out.println("입력한 수 까지의 합 : " +x);
		Random rd = new Random();
		int y = rd.nextInt(10);	
		System.out.println("랜덤값 : "+y);
		System.out.println("결과값 :"+x*y);		
	}

}
