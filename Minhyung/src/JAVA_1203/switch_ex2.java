package JAVA_1203;

import java.util.Scanner;

public class switch_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� �Է��ϼ��� :");
		int year = sc.nextInt();
		int year_1 = year % 12;

//		switch(year_1) {
//		
//		case 0 : System.out.println("�����̶�"); break;
//		case 1 : System.out.println("�߶�"); break;
//		case 2 : System.out.println("����"); break;
//		case 3 : System.out.println("������"); break;
//		case 4 : System.out.println("���"); break;
//		case 5 : System.out.println("�Ҷ�"); break;
//		case 6 : System.out.println("ȣ���̶�"); break;
//		case 7 : System.out.println("�䳢��"); break;
//		case 8 : System.out.println("�����"); break;
//		case 9 : System.out.println("���"); break;
//		case 10 : System.out.println("����"); break;
//		case 11 : System.out.println("���"); break;
//		}

		if (year_1 == 0) {
			System.out.println("�����̶�");
		} else if (year_1 == 1) {
			System.out.println("�߶�");

		} else if (year_1 == 2) {
			System.out.println("����");
		} else if (year_1 == 3) {
			System.out.println("������");

		} else if (year_1 == 4) {
			System.out.println("���");

		} else if (year_1 == 5) {
			System.out.println("�Ҷ�");

		} else if (year_1 == 6) {
			System.out.println("ȣ���̶�");

		}else if(year_1==7) {
			System.out.println("�䳢��");
			
		}else if(year_1==8) {
			System.out.println("���");
			
		}else if(year_1==9) {
			System.out.println("���");
			
		}else if(year_1==10) {
			System.out.println("����");
			
		}else if(year_1==11) {
			System.out.println("���");
			
		}

	}

}
