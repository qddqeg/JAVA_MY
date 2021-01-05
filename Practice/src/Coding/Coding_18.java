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
			System.out.println("두개의 정수를 입력해야합니다.");
			System.out.println("첫번째 정수를 입력하세요");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수를 입력하세요");
			int num2 = sc.nextInt();
			System.out.println("어떤 연산을 하시겠어요? + - x / %");
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
			System.out.println("계속 : Y, 종료 : N");

			String yn = sc.next(); 

			if (yn.equals("Y") || yn.equals("y")) { 

			System.out.println("---------------------");

			continue; 

			}

			if (yn.equals("N") || yn.equals("n")) { 
				System.out.println("종료되었습니다.");
			break; 

			}
			
		}
		
	}

}
