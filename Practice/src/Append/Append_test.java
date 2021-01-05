package Append;
import java.util.Scanner;

public class Append_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("연산을 입력하세요");
		String cal = sc.next();
		String getCal[] = cal.split("\\+");
		int i;
		int j;
		
		StringBuilder sb = new StringBuilder(getCal[0]);
		
		
		for(i=0; i<cal.length(); i++) {
			if(i==0) {
				System.out.println(getCal[0]);
			}else if(i>0) {
				for(j=1; j<cal.length(); j++) {
					sb.append("+"+getCal[j]);
					System.out.println(sb);
				}
			}
		}

		
		
	}

}
