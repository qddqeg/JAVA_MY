package JAVA_1203;

import java.util.Scanner;

public class switch_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ãâ»ý¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä :");
		int year = sc.nextInt();
		int year_1 = year % 12;

//		switch(year_1) {
//		
//		case 0 : System.out.println("¿ø¼þÀÌ¶ì"); break;
//		case 1 : System.out.println("´ß¶ì"); break;
//		case 2 : System.out.println("°³¶ì"); break;
//		case 3 : System.out.println("µÅÁö¶ì"); break;
//		case 4 : System.out.println("Áã¶ì"); break;
//		case 5 : System.out.println("¼Ò¶ì"); break;
//		case 6 : System.out.println("È£¶ûÀÌ¶ì"); break;
//		case 7 : System.out.println("Åä³¢¶ì"); break;
//		case 8 : System.out.println("¿ø¿ë¶ì"); break;
//		case 9 : System.out.println("¹ì¶ì"); break;
//		case 10 : System.out.println("¸»¶ì"); break;
//		case 11 : System.out.println("¾ç¶ì"); break;
//		}

		if (year_1 == 0) {
			System.out.println("¿ø¼þÀÌ¶ì");
		} else if (year_1 == 1) {
			System.out.println("´ß¶ì");

		} else if (year_1 == 2) {
			System.out.println("°³¶ì");
		} else if (year_1 == 3) {
			System.out.println("µÅÁö¶ì");

		} else if (year_1 == 4) {
			System.out.println("Áã¶ì");

		} else if (year_1 == 5) {
			System.out.println("¼Ò¶ì");

		} else if (year_1 == 6) {
			System.out.println("È£¶ûÀÌ¶ì");

		}else if(year_1==7) {
			System.out.println("Åä³¢¶ì");
			
		}else if(year_1==8) {
			System.out.println("¿ë¶ì");
			
		}else if(year_1==9) {
			System.out.println("¹ì¶ì");
			
		}else if(year_1==10) {
			System.out.println("¸»¶ì");
			
		}else if(year_1==11) {
			System.out.println("¾ç¶ì");
			
		}

	}

}
