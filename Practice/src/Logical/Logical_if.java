package Logical;
import java.util.Random;

public class Logical_if {

	public static void main(String[] args) {
		Random rd = new Random();
		//double num = (Math.random()*6);
		double dice = (Math.random()*6)+1; // Math.random -> 0 ���� �������� �Ǽ��� ���ڸ� �̾Ƴ�
		//int dice = rd.nextInt(6);
		System.out.println(dice);
		
		if(dice == 1) {
			System.out.println("�ֻ����� 1�� ���Խ��ϴ�");
		}else if(dice == 2) {
			System.out.println("�ֻ����� 2�� ���Խ��ϴ�.");
		}else if(dice == 3) {
			System.out.println("�ֻ����� 3�� ���Խ��ϴ�.");
		}else if(dice == 4) {
			System.out.println("�ֻ����� 4�� ���Խ��ϴ�.");
		}else if(dice == 5) {
			System.out.println("�ֻ����� 5�� ���Խ��ϴ�.");
		}else if(dice == 6) {
			System.out.println("�ֻ����� 6�� ���Խ��ϴ�.");
		}else{
			System.out.println("�ֻ��� ���ڰ� �ƴմϴ�.");			
		}			
		
		
		// TODO Auto-generated method stub
		
	}

}
