import java.util.Scanner;
public class Switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��ϼ���");
		
		String grade = sc.next();
		
		switch(grade) {
		case "A":
		case "a":
			System.out.println("���� ���� �Ⱦ��ּż� �����մϴ�");
		break;
		
		case "B":
		case "b":
			System.out.println("���ݸ� �� ���ּ���");
		break;
		default:
			System.out.println("��������");
		}
		
	}

}
