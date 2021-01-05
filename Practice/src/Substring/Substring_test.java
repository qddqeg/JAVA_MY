package Substring;
import java.util.Scanner;
public class Substring_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		
		String k = sc.next();
		int i = k.length();
		int j;
		
		System.out.println("입력한 글자 수 : "+i);
		
		if(i<=20) {
			for(j=0; j<i; j++) {
				System.out.println(k.substring(j,j+1));
			}
		}else {
			System.out.println("안돼");
		}
		
		
	}

}
