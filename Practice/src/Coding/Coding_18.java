package Coding;
import java.util.Scanner;
public class Coding_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Coding_18_plus pl = new Coding_18_plus();
		Coding_18_minus mi = new Coding_18_minus();
		Coding_18_multi mt = new Coding_18_multi();
		Coding_18_div div = new Coding_18_div();
		boolean stop = false;
		
		while(!stop) {
			System.out.println("�ΰ��� ������ �Է��ؾ��մϴ�.");
			System.out.println("ù��° ������ �Է��ϼ���");
			int num1 = sc.nextInt();
			System.out.println("�ι�° ������ �Է��ϼ���");
			int num2 = sc.nextInt();
			System.out.println("� ������ �Ͻðھ��? + - x / %");
			String k = sc.next();
			if (k.equals("+")) {
				System.out.println(pl.Plus(num1, num2));
			}
			if (k.equals("-")) {
				System.out.println(mi.Minus(num1, num2));
			}
			if (k.equals("X")|| k.equals("x")) {
				System.out.println(mt.Multi(num1, num2));
			}
			if (k.equals("/")) {
				System.out.println(div.Div(num1, num2));
			}	
			System.out.println("��� : Y, ���� : N");

			String yn = sc.next(); 

			if (yn.equals("Y") || yn.equals("y")) { 

			System.out.println("---------------------");

			continue; 

			}

			if (yn.equals("N") || yn.equals("n")) { 
				System.out.println("����Ǿ����ϴ�.");
			break; 

			}
			
		}
		
	}

}
