package JAVA_0104;

import java.util.Scanner;

public class Str_C {
	Str_B B = new Str_B();
	Scanner sc = new Scanner(System.in);

	public void Str_C() {
		System.out.println("str 값을 입력하세요.");
		B.str = sc.next();
		System.out.println("Int 값을 입력하세요.");
		B.c = sc.nextInt();

	}
}
