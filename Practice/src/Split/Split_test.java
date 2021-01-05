package Split;
import java.util.Scanner;
public class Split_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("연산을 입력하세요");
		String cal = sc.next();
		
		String getCal[] = cal.split("\\+");
		
		int i = Integer.parseInt(getCal[0]);
		int j = Integer.parseInt(getCal[1]);
		
		System.out.println(i+j);
		
		
		
	}

}
