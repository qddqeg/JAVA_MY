package JAVA_1218;
import java.util.Scanner;
public class BankApplication {

private static Account[] accArray = new Account[100];
private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	boolean run = true;
	while(run) {
		System.out.println("=================================================");
		System.out.println("1.계좌생성  | 2. 계좌목록  | 3.예금  | 4.출금  | 5.종료");
		System.out.println("=================================================");
		System.out.println("선택->");
		
		int selectNo =sc.nextInt();
		
		if(selectNo == 1) {
			createAccount();
			
		}
	}
}
}
