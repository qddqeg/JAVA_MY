package Coding;

import java.util.Scanner;

public class Coding_16_vol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		
		boolean vol = false;
		while(!vol) {
			System.out.println("������ �����ϼ���");
			String k = sc.next();
			if(k.equals("+")) {
				i++;
				System.out.println("������ �ö󰬽��ϴ�. ���� ������ :"+i);
			}
			if(k.equals("-")) {
				i--;
				System.out.println("������ ���������ϴ�. ���� ������ :"+i);
			}
		}		// TODO Auto-generated method stub

	}

}
