package Coding;
import java.util.Random;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Lotto ��ȣ�� ��÷�ϰڽ��ϴ�.");
		Random rd = new Random();
		int[]lotto = new int[6];
		int i;
		int j;

		for(i=0; i<6; i++) {
			lotto[i]=rd.nextInt(45)+1;
			
			for(j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}

		}
		for(i=0; i<6; i++) {
			System.out.println(i+1+"�� ��ȣ : "+lotto[i]);	
		}
	}

}