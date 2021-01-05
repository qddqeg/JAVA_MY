package Substring;
import java.util.Scanner;
public class Substring_test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		
		String k = sc.next();
		int i = k.length();
		int j;
		int l;
		
		System.out.println("입력한 글자 수 : "+i);
		
		if(i<=20) {
			for(j=0; j<i; j++) {
				 // System.out.println("j값 : "+j);
				 for(l=j+1; l<=j+1; l++) {
					 // System.out.println("l값 :"+l);
					 System.out.println(k.substring(j,l));
				 }
			}
		}else {
			System.out.println("안돼");
		}
		
		
	}

}
