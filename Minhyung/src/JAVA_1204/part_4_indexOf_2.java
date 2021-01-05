package JAVA_1204;

public class part_4_indexOf_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_1 = "AB123";
		String str_2 = "AB34B";
		int idx = 0;

		for (int k = 0; k < str_1.length(); k++) {
			char c = str_1.charAt(0);
			System.out.println("CharAT:" +c);
			int num = c;
			System.out.println("숫자 변환:"+num);

			if (num >= 48 && num <= 57) {
				idx = k;
				System.out.println(idx);
				break;

			}

		}

		String sub = str_1.substring(idx, str_1.length());
		System.out.println(sub);

	}

}
