package JAVA_1229;

import java.util.Scanner;

public class USER_Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		USER user = new USER();
		ID_input(user);
		Name_input(user);
		PASS_input(user);
	
	}

	public static void ID_input(USER user) {

		System.out.println("ID�� �Է��� �ּ���.");
		String input = sc.nextLine();

		user.setID(input);
		System.out.println(user.getID());
	}

	public static void Name_input(USER user) {

		System.out.println("Name�� �Է��� �ּ���.");
		String input = sc.nextLine();

		user.setName(input);
		System.out.println(user.getName());
	}
	public static void PASS_input(USER user) {
		System.out.println("PASS�� �Է��� �ּ���.");
		int pass = sc.nextInt();

		user.setPASS(pass);
		System.out.println(user.getPASS());
	}

}
