package Test;
import java.util.Scanner;
import java.util.Random;
public class Text_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i = sc.nextInt();
		int j = 0;
		int x = 0;
		
		for(j=0; j<=i; j++) {
			x+=j;
		}
		System.out.println("�Է��� �� ������ �� : " +x);
		Random rd = new Random();
		int y = rd.nextInt(30)+1;	
		System.out.println("������ : "+y);
		System.out.println("����� :"+(double)x/y);
	}

}
