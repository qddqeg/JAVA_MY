package While;
import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		int i = sc.nextInt();
		int k = 0;
		int j = 0;
		
		while(k<=i) {
			// System.out.println("���� k�� �� :"+k);
			// System.out.println(k);
			System.out.println(j);
			k++;
			j+=k;

		}
		
	}

}
