package JAVA_1230;

import java.util.Scanner;

public class Car_main extends Car_color {
	public Car_main(String col_1,String col_2,String col_3,String col_4,String col_5) {
		super();
	}

	static Scanner sc = new Scanner(System.in);
	static int pick;
	static boolean bo = true;

	public static void main(String[] args) {

		while (bo) {
			System.out.println("===================================");
			System.out.println("자동차를 만듭니다 ");
			System.out.println("                 _____             ");
			System.out.println("             ___/  ㅁ  |__           ");
			System.out.println("            (---0-----0---)          ");

			System.out.println("===================================");
			System.out.println("| 1.color | 2.company | 3.tire |");
			System.out.println("===================================");
			pick = sc.nextInt();
			switch (pick) {
			case 1:
				
			}

		}

	}
	

}
