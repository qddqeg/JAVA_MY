package JAVA_1207;
import java.util.Scanner;
public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �����ּ���.");
		String str = sc.next();
		
		int sum=0;
		
		for(int rota=1; rota<str.length(); rota++) {
			char c =str.charAt(0);
			 char cc =c;
			 sum = c+= rota;
			
			
		}
		 System.out.println("���տ� : " +sum);
	}     

}
