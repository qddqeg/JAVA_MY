package JAVA_1214;

import java.util.Scanner;

public class part_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		String str = sc.nextLine();

		boolean bo = string_boo(str);
		// System.out.println(bo);
		if (bo == true) {
			int idx = string_idx(str);
			System.out.println("!�� ��ġ�� : " + idx + " �Դϴ�.");
		} else {
			System.out.println("����ǥ�� �����ϴ�.");
		}
	}

	public static boolean string_boo(String str) {

		boolean bo = str.contains("!");
		return bo;
	}

	public static int string_idx(String str) {

		int idx = str.indexOf("!");
		return idx;
	}

}