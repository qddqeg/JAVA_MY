package For;
import java.util.Scanner;
public class For_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하시오");	
		
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int i;
		
		System.out.println("첫번째 입력 값 : "+sc1);
		System.out.println("첫번째 입력 값 : "+sc2);
		
		boolean b = sc1 < sc2;
			if(true) {
				for(i=sc1; i<=sc2; i++) {
					if(i%2==0) {
						System.out.println("짝수 : "+i);
					}else {
						System.out.println("홀수 : "+i);
					}
				}
			}else {
				System.out.println("숫자가 정확하지 않습니다");
			}	
	}

}
