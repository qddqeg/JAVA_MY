package While;
import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int i = sc.nextInt();
		int k = 0;
		int j = 0;
		
		while(k<=i) {
			// System.out.println("현재 k의 값 :"+k);
			// System.out.println(k);
			System.out.println(j);
			k++;
			j+=k;

		}
		
	}

}
