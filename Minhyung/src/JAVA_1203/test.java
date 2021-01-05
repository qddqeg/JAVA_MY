package JAVA_1203;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 걸어주세요.");// 돈을 건다.
		int money = sc.nextInt();
		
		

		System.out.println("첫번쨰 주사위를 굴리세요.");// 주사위 굴림
		int num1 = sc.nextInt();
		System.out.println("두번째 주사위를 굴리세요.");
		int num2 = sc.nextInt();

		
		
		double dice_1 = (Math.random() * 6) + 1; // 6면체 주사위
   	    int dice1 = (int) dice_1;
		double dice_2 = (Math.random() * 6) + 1;
		int dice2 = (int) dice_2;
		System.out.println("첫번쨰 주사위 굴린결과 :" + dice1);
		System.out.println("두번쨰 주사위 굴린결과 :" + dice2);

		
//       Rule
//        1. 주사위가 1 1 이 나오면 2배받음
//        2.주사위가 2 6 이 나오면 4배받음
//        3.주사위가 6 6 이 나오면 2배 손해 

		if (dice1 == 1 && dice2 == 1) {
			money = money * 2;
			System.out.println("주사위가 1,1이 나오면서" + money + "원을 받았습니다.*2");

		}
		if(dice1 ==2 && dice2 ==6) {
			money =money * 4;
			System.out.println("주사위가 2,2가 나오면서"+ money + "원을 받았습니다 *4.");
		}
		if(dice1 ==6 && dice2 ==6) {
			money = money % 2;
			System.out.println("주사위가 6,6이 나오면서"+ money +"절반이 되었습니다./2");
		}
		
		
	}

}
