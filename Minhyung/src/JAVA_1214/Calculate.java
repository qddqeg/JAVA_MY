package JAVA_1214;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����� �Ͻðڽ��ϱ�?");
		int count = sc.nextInt(); // �� ������ ����
		int num[] = new int[count]; // �� ������ŭ �迭 ����
		for (int i = 0; i < count; i++) { // for �� ����
			num[i] = count_process(i); // count_process
		}
		String cal = cal();
		System.out.println(cal);
	}

	public static int count_process(int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println(count + 1 + " �� ° ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		return num;
	}

	public static String cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("� ������ �Ͻðڽ��ϱ�?");
		String str = sc.nextLine();
		return str;
	}
}