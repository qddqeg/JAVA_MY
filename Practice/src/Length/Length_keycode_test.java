package Length;
import java.util.Scanner;

public class Length_keycode_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		String k = sc.next();
		int i = k.length();
		
		if(i <= 10) {
			System.out.println("�Է��� ���� : "+k);
		}else if(i >10) {
			System.out.println("����� �� �����ϴ�.");
		}
	}

}
