package For;
import java.util.Scanner;
public class For_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է��Ͻÿ�");	
		
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int i;
		
		System.out.println("ù��° �Է� �� : "+sc1);
		System.out.println("ù��° �Է� �� : "+sc2);
		
		boolean b = sc1 < sc2;
			if(true) {
				for(i=sc1; i<=sc2; i++) {
					if(i%2==0) {
						System.out.println("¦�� : "+i);
					}else {
						System.out.println("Ȧ�� : "+i);
					}
				}
			}else {
				System.out.println("���ڰ� ��Ȯ���� �ʽ��ϴ�");
			}	
	}

}
