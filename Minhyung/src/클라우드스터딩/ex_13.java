package Ŭ���彺�͵�;
import java.util.Scanner;
public class ex_13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���.");
		int year=sc.nextInt();
		if(year>=18) {
			System.out.println("���� �Դϴ�.");
		}else if(year<18&&year>=13) {
			System.out.println("û�ҳ� �Դϴ�.");
		}else if(year<13&&year>=6) {
			System.out.println("��� �Դϴ�.");
		}else if(year<=5) {
			System.out.println("���� �Դϴ�.");
		}

	}

}
