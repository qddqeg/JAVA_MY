package JAVA_1209;
import java.util.Scanner;
public class part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner sc =new Scanner(System.in);
//        System.out.println("���ڸ� �Է����ּ���");
//        String str=sc.next();
//        System.out.println("�ι�° ���ڸ� �Է����ּ���");
//        String str_1=sc.next();
//        
//        if(str.equals(str_1)) {
//        	System.out.println("�Է��Ͻ� ������ �����ϴ�.");
//        }else {
//        	System.out.println("�Է��Ͻ� ������ �ٸ��ϴ�.");
//        }
		Scanner sc= new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		int num_1=sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		int num_2=sc.nextInt();
		
		int mult =num_1*num_2;
		
		if(mult%2==0) {
			System.out.println("���� �� : "+mult+ " �� '¦��'�Դϴ�");
		}
		if(mult%2==1) {
			System.out.println("���� �� : "+mult+ " �� 'Ȧ��'�Դϴ�");
		}
	}

}
