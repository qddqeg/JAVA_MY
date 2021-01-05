package Array;
import java.util.Scanner;
public class Array_accout_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		
		String k = sc.next();
		int i = k.length();
		int j;
		String str_array[]=new String[i];

	

		
		
		for(j=0; j<i; j++) {
			str_array[j]=k.substring(j,j+1);
			System.out.println(str_array[j]);
		}
		
		String x ="";
	
		for(j=0; j<i; j++) {
			x += str_array[j];
		}
		System.out.println(x);

	}

}
