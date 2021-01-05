package Length;
import java.util.Scanner;
public class Length_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		
		String k = sc.next();
		int i = k.length(); // 불러온 값의 글자수를 체크 ex)비밀번호 자릿 수
		System.out.println("당신이 입력한 글자 수는 모두"+i+"자 입니다.");
		
		
	}

}
