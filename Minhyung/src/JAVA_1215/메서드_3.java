package JAVA_1215;

import java.util.Scanner;

public class �޼���_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num_1 = sc.nextInt();
		int dice = dice_1(num_1);
		System.out.println("ù��° �ֻ��� " + num_1 + " ��ü �ֻ����� �����ϴ�." + dice);
		int return_dice = dice_2(dice);
		System.out.println("�ι�° �ֻ��� ù��° �ֻ������� ���°����� �ֻ����� �����ϴ�." + return_dice);
	}

	public static int dice_1(int num_1) {
		int dice = (int) (Math.random() * num_1) + 1;

		return dice;
	}

	public static int dice_2(int dice) {
		int return_dice = (int) (Math.random() * dice) + 1;

		return return_dice;

	}
}
