package Logical;
import java.util.Random;

public class Logical_if {

	public static void main(String[] args) {
		Random rd = new Random();
		//double num = (Math.random()*6);
		double dice = (Math.random()*6)+1; // Math.random -> 0 부터 랜덤으로 실수형 숫자를 뽑아냄
		//int dice = rd.nextInt(6);
		System.out.println(dice);
		
		if(dice == 1) {
			System.out.println("주사위가 1이 나왔습니다");
		}else if(dice == 2) {
			System.out.println("주사위가 2가 나왔습니다.");
		}else if(dice == 3) {
			System.out.println("주사위가 3이 나왔습니다.");
		}else if(dice == 4) {
			System.out.println("주사위가 4가 나왔습니다.");
		}else if(dice == 5) {
			System.out.println("주사위가 5가 나왔습니다.");
		}else if(dice == 6) {
			System.out.println("주사위가 6이 나왔습니다.");
		}else{
			System.out.println("주사위 숫자가 아닙니다.");			
		}			
		
		
		// TODO Auto-generated method stub
		
	}

}
