package JAVA_1204;
import java.util.Scanner;
public class 구구단_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("몇단");
        int dan =sc.nextInt();
        int i =0;
       for(i =1; i<=9; i++) {
    	   int j=dan*i;
    	   System.out.println(dan+"*"+i+"="+j);
    	   
       }
        
	}

}
