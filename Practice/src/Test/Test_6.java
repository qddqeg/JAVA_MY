package Test;

import java.util.Scanner;
public class Test_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i = sc.nextInt();
		int j = 0;
		int x = 0;
		
		for(j=1; j<=i; j++) {
			if(j%2 == 0) {
				
			}else {
				x +=j;
			}
		}
		System.out.println("Ȧ�� ���� �� : "+x);

		
	}

}
