package JAVA_1215;

import java.util.Scanner;

public class 메서드_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num_1 = sc.nextInt();
		int dice = dice_1(num_1);
		System.out.println("첫번째 주사위 " + num_1 + " 면체 주사위를 굴립니다." + dice);
		int return_dice = dice_2(dice);
		System.out.println("두번째 주사위 첫번째 주사위에서 나온값으로 주사위를 굴립니다." + return_dice);
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
