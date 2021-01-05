package JAVA_1223;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String pm = "010-3636-6044";
		String str = sc.next();
		String name[] = new String[3];
		for (int i = 0; i < str.length(); i++) {
			name[i] = str.substring(i, i + 1);

		}
		for (String k : name) {
			System.out.println(k);
		}
		String str_1[] = pm.split("-");

		for (String s : str_1) {
			System.out.println(s);

		}

	}
}
