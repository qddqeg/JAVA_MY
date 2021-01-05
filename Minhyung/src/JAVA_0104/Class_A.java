package JAVA_0104;

import java.util.Scanner;

public class Class_A {

	public static void main(String[] args) {
		boolean run = true;
		Class_A_list list = new Class_A_list();
		//list.Class_B_array = new Class_B[3];
		//list.current = 0;

		while (run) {
			// 객체배열이 매개변수.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("--\n ★★★ 1.입력 2.출력 ★★★");
			int select = sc.nextInt();
			System.out.println("--");
			
			switch (select) {
			case 1:
				list.plus(list);
				break;
			case 2:
				list.print(list);
			}
		}
	}




}
