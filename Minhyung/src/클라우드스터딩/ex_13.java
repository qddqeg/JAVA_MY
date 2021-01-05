package 클라우드스터딩;
import java.util.Scanner;
public class ex_13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		int year=sc.nextInt();
		if(year>=18) {
			System.out.println("성인 입니다.");
		}else if(year<18&&year>=13) {
			System.out.println("청소년 입니다.");
		}else if(year<13&&year>=6) {
			System.out.println("어린이 입니다.");
		}else if(year<=5) {
			System.out.println("유아 입니다.");
		}

	}

}
