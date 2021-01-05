package Coding;

import java.util.Scanner;

public class Coding_16_vol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		
		boolean vol = false;
		while(!vol) {
			System.out.println("볼륩을 조절하세요");
			String k = sc.next();
			if(k.equals("+")) {
				i++;
				System.out.println("볼륨이 올라갔습니다. 현재 볼륨은 :"+i);
			}
			if(k.equals("-")) {
				i--;
				System.out.println("볼륨이 내려갔습니다. 현재 볼륨은 :"+i);
			}
		}		// TODO Auto-generated method stub

	}

}
