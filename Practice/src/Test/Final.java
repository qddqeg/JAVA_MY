package Test;
import java.util.Scanner;
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		
		boolean vol = false;
		while(!vol) {
			System.out.println("������ �����ϼ���(���� ������ : 0)");
			String k = sc.next();
			if(k.equals("+")) {
				i++;
				System.out.println("������ �ö󰬽��ϴ�. ���� ������ :"+i);
			}
			if(k.equals("-")) {
				i--;
				System.out.println("������ ���������ϴ�. ���� ������ :"+i);
			}				
		}	
	}

}
