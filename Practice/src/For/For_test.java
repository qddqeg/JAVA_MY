package For;
import java.util.Scanner;
public class For_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		int enter = sc.nextInt();
		int i;
		int j;
		
		for(i=enter; i<=10; i++) {
			System.out.println("****"+i+"��****");
			for(j=1; j <= 9; j++)
			System.out.println(i+"x"+j+"="+(i*j));				
		}
		if(enter>10) {
			System.out.println("���ؿ�");
		}
	}
}
