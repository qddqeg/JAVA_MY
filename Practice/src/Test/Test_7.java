package Test;

import java.util.Scanner;
public class Test_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String k = sc.next();
		int i= k.length();
		int j;
		
		String k_array[]=new String[i];
		
		for(j=0; j<k.length(); j++) {
			k_array[j]=k.substring(j,j+1);
			System.out.println(k_array[j]);
		}
		
	}

}
