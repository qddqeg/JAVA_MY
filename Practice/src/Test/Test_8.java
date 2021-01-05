package Test;

import java.util.Scanner;
public class Test_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int k = sc.nextInt();
		
		int i = k/1000;
		int j = k/500;
		int l = k/100;
		int o = k%100;
		System.out.println("1000원 짜리 : "+i+"개");
		System.out.println("500원 짜리 : "+j+"개");
		System.out.println("100원 짜리 : "+l+"개");
		System.out.println("나머지 :  "+o);
	}

}
