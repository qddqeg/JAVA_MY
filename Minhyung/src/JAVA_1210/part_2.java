package JAVA_1210;

import java.util.Scanner;

public class part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // continue 이거 빼고 나머지 ex 짝수 빼고 홀수만 찍기
		System.out.println("알파벳을 입력해주세요.");
		String str = sc.next();
		char a = ' ';
		String s = "-";
		String s_1 = "o";

		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			// System.out.println(j);

			String str_2 = Integer.toBinaryString(j);
			// System.out.println(str_2);
			for (j = 0; j < str_2.length(); j++) {
				String sub = str_2.substring(j, j + 1);
				// System.out.println(sub);
				if (sub.equals("1")) {
					System.out.println(s_1);
				} else if (sub.equals("0")) {
					System.out.println(s);
				}
			}

		}

	}

}
