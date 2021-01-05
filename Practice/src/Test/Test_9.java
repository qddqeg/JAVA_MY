package Test;

import java.util.Scanner;
public class Test_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int i = sc.nextInt();
		
		int i_1000 = i/1000;
		int i_500 = i%1000/500;
		int i_100 = i%500/100;
		int i_x = i%100;
		System.out.println("1000원짜리 : "+i_1000+"개");
		System.out.println("500원짜리 : "+i_500+"개");
		System.out.println("100원짜리 : "+i_100+"개");
		System.out.println("나머지 : "+i_x);
		
		

		
		
		
	}

}
