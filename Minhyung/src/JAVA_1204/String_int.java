package JAVA_1204;
import java.util.Scanner;
public class String_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num_str ="12345";
		
		System.out.println("String �� :"+num_str);
		
		int str_num =Integer.parseInt(num_str);   //�ַ� ��� ���ڸ� ���ڷ� �ٲ��ִ°�
		
		int str_num_1 =Integer.valueOf(num_str);  // ���� ���� �۾Ƽ� �߻�� ���� ����
		
		System.out.println("int ��_pars :"+str_num);
		System.out.println("int ��_valu :"+str_num_1);
		String sum =num_str+10; //���ڷ� ���
		int sum_1 =str_num+10; //���ڷ� ���
		
		System.out.println("�����̱⋚���� �������� �ʴ´�"+sum);
		System.out.println("���ڸ� ���ڷ� �ٲ���� ������ ��������: "+sum_1);
	}

}
