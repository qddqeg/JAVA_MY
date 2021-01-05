package JAVA_1209;
import java.util.Scanner;
public class part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner sc =new Scanner(System.in);
//        System.out.println("문자를 입력해주세요");
//        String str=sc.next();
//        System.out.println("두번째 문자를 입력해주세요");
//        String str_1=sc.next();
//        
//        if(str.equals(str_1)) {
//        	System.out.println("입력하신 문장은 같습니다.");
//        }else {
//        	System.out.println("입력하신 문장은 다릅니다.");
//        }
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num_1=sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		int num_2=sc.nextInt();
		
		int mult =num_1*num_2;
		
		if(mult%2==0) {
			System.out.println("곱한 값 : "+mult+ " 는 '짝수'입니다");
		}
		if(mult%2==1) {
			System.out.println("곱한 값 : "+mult+ " 는 '홀수'입니다");
		}
	}

}
