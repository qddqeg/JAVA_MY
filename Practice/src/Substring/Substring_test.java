package Substring;
import java.util.Scanner;
public class Substring_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		String k = sc.next();
		int i = k.length();
		int j;
		
		System.out.println("�Է��� ���� �� : "+i);
		
		if(i<=20) {
			for(j=0; j<i; j++) {
				System.out.println(k.substring(j,j+1));
			}
		}else {
			System.out.println("�ȵ�");
		}
		
		
	}

}
