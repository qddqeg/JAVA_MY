package Logical;
import java.util.Scanner;
import java.util.Random;

public class Logical_if_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("���� �Է��ϼ���");
		int scanner = sc.nextInt();
		
		System.out.println("Scanner ���� : "+scanner);
		
		//double random = (Math.random()*10);
		int random = rd.nextInt(10)+1;
		System.out.println("random �� : "+random);
		
		double result = (double) scanner/random;
		System.out.println("Scanner�� Random���� ���� �� : "+result);
		
		if(result >= 100) {
			System.out.println("�ſ� Ů�ϴ�.");
		}else if(result >= 90){
			System.out.println("Ů�ϴ�");	
		}else if(result >= 80) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�۽��ϴ�");
		}
		
	}

}
