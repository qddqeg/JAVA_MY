package JAVA_1218;
import java.util.Scanner;
public class BankApplication {

private static Account[] accArray = new Account[100];
private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	boolean run = true;
	while(run) {
		System.out.println("=================================================");
		System.out.println("1.���»���  | 2. ���¸��  | 3.����  | 4.���  | 5.����");
		System.out.println("=================================================");
		System.out.println("����->");
		
		int selectNo =sc.nextInt();
		
		if(selectNo == 1) {
			createAccount();
			
		}
	}
}
}
