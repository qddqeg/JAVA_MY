package Length;
import java.util.Scanner;

public class Length_keycode_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		
		String k = sc.next();
		int i = k.length();
		
		if(i <= 10) {
			System.out.println("입력한 글자 : "+k);
		}else if(i >10) {
			System.out.println("출력할 수 없습니다.");
		}
	}

}
