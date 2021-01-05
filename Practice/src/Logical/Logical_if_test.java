package Logical;
import java.util.Scanner;
import java.util.Random;

public class Logical_if_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("값을 입력하세요");
		int scanner = sc.nextInt();
		
		System.out.println("Scanner 값은 : "+scanner);
		
		//double random = (Math.random()*10);
		int random = rd.nextInt(10)+1;
		System.out.println("random 값 : "+random);
		
		double result = (double) scanner/random;
		System.out.println("Scanner를 Random으로 나눈 값 : "+result);
		
		if(result >= 100) {
			System.out.println("매우 큽니다.");
		}else if(result >= 90){
			System.out.println("큽니다");	
		}else if(result >= 80) {
			System.out.println("보통입니다.");
		}else {
			System.out.println("작습니다");
		}
		
	}

}
