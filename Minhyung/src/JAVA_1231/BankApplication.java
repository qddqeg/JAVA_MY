package JAVA_1231;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("===============================================");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===============================================");
			System.out.println("선택---> ");

			int pick = sc.nextInt();

			switch (pick) {
			case 1:
				createAccount();
				break;

			case 2:
				accountList();
				break;

			case 3:
				deposit();
				break;

			case 4:
				withdraw();
				break;

			case 5:
				run = false;
				break;
			}

		}

	}

	private static void createAccount() {
		System.out.println("============");
		System.out.println("계좌생성");
		System.out.println("============");

		System.out.print("계좌번호: ");
		String ano = sc.next();

		System.out.print("계좌주: ");
		String owner = sc.next();

		System.out.print("초기입금액: ");
		int balance = sc.nextInt();

		Account account = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("============");
		System.out.println("계좌목록");
		System.out.println("============");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null)
				break;
			System.out.println(
					accountArray[i].getAno() + "  " + accountArray[i].getOwner() + "  " + accountArray[i].getBalance());
		}

	}

	private static void deposit() {
		System.out.println("============");
		System.out.println("예금");
		System.out.println("============");
		
		System.out.print("계좌번호: ");
		String ano = sc.next();

		System.out.print("예금액: ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);

	}

	private static void withdraw() {

	}
}
