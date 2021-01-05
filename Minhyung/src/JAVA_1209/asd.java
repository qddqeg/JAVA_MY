package JAVA_1209;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("문자를 입력해주세요.");
         String str = sc.nextLine();
         String a[] = str.split(" |-|;|@"); 
         
         for(int i=0; i<a.length; i++) { 
       	  System.out.println(a[i]); 
         }
	}

}
