package JAVA_1204;

import java.util.Scanner;

public class Scanner_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {                                   // 글자 하나씩 자르는 과정
			String sub = str.substring(i, i + 1);
			System.out.println(sub);

			if (sub.equals("#") || sub.equals("!") || sub.equals("?")) {      // 잘못 입력한것

				System.out.println("잘못 입력하셨습니다.");
			} else {                                                       // 나머지는 정상 입력한 것
				System.out.println("정상적으로 입력하셨습니다.");
			}
		}
	}

}
