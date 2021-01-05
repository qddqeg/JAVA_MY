package JAVA_1223;
import java.util.Scanner;
public class plas_main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();		
		plas pl=new plas(i,j);
System.out.println(pl.sum);
	}

}
