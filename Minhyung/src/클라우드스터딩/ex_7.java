package 클라우드스터딩;

import java.util.Scanner;

public class ex_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("// 유로, 달러 순 입력");
		int euro = sc.nextInt();
		int doller = sc.nextInt();

		double euro_R = 1320.48026 * euro;
		double doller_R = 1063.82979 * doller;
		double sum = euro_R + doller_R;

		System.out.println(euro + "유로" + " + " + doller + "달러 = " + (int) sum + " 원입니다");

	}

}
