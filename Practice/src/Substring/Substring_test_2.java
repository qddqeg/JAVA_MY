package Substring;
import java.util.Scanner;
public class Substring_test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		String k = sc.next();
		int i = k.length();
		int j;
		int l;
		
		System.out.println("�Է��� ���� �� : "+i);
		
		if(i<=20) {
			for(j=0; j<i; j++) {
				 // System.out.println("j�� : "+j);
				 for(l=j+1; l<=j+1; l++) {
					 // System.out.println("l�� :"+l);
					 System.out.println(k.substring(j,l));
				 }
			}
		}else {
			System.out.println("�ȵ�");
		}
		
		
	}

}
