package JAVA_1203;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �ɾ��ּ���.");// ���� �Ǵ�.
		int money = sc.nextInt();
		
		

		System.out.println("ù���� �ֻ����� ��������.");// �ֻ��� ����
		int num1 = sc.nextInt();
		System.out.println("�ι�° �ֻ����� ��������.");
		int num2 = sc.nextInt();

		
		
		double dice_1 = (Math.random() * 6) + 1; // 6��ü �ֻ���
   	    int dice1 = (int) dice_1;
		double dice_2 = (Math.random() * 6) + 1;
		int dice2 = (int) dice_2;
		System.out.println("ù���� �ֻ��� ������� :" + dice1);
		System.out.println("�ι��� �ֻ��� ������� :" + dice2);

		
//       Rule
//        1. �ֻ����� 1 1 �� ������ 2�����
//        2.�ֻ����� 2 6 �� ������ 4�����
//        3.�ֻ����� 6 6 �� ������ 2�� ���� 

		if (dice1 == 1 && dice2 == 1) {
			money = money * 2;
			System.out.println("�ֻ����� 1,1�� �����鼭" + money + "���� �޾ҽ��ϴ�.*2");

		}
		if(dice1 ==2 && dice2 ==6) {
			money =money * 4;
			System.out.println("�ֻ����� 2,2�� �����鼭"+ money + "���� �޾ҽ��ϴ� *4.");
		}
		if(dice1 ==6 && dice2 ==6) {
			money = money % 2;
			System.out.println("�ֻ����� 6,6�� �����鼭"+ money +"������ �Ǿ����ϴ�./2");
		}
		
		
	}

}
