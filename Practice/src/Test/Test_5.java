package Test;
import java.util.Scanner;
public class Test_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean stop =false;
		while(!stop) {
			int num1 =0;
			int num2 =0;
			int num3 =0;
			int num4 =0;
			int num5 =0;
			int num;
			
			int cnt;
			System.out.println("어떤 연산을 하시겠어요? ( + - x / % )");
			String k =sc.next();
			
		/*	int x = Integer.parseInt(k);
			char y = (char)x;
			if(y<=48) {
				System.out.println("잘못 입력하였습니다. 기호를 입력해주세요");
				
			}else if(y>=148) {
				System.out.println("잘못 입력하였습니다. 기호를 입력해주세요");
			}
			*/
			
			if(k.equals("%")) {
				System.out.println("2개의 숫자를 입력하세요");
				System.out.println("첫번째 수를 입력하세요");
				num1 = sc.nextInt();
				System.out.println("두번째 수를 입력하세요");
				num2 = sc.nextInt();
				System.out.println((double)num1/num2);
			}
			if(k.equals("+")) {
				System.out.println("몇개의 숫자로 계산하시겠습니까");
				cnt = sc.nextInt();
				if(cnt==1 || cnt>5) {
					System.out.println("너무 적거나 많습니다.");
					continue;
				}else {
					for(int i=1; i <= cnt; i++) {
						System.out.println(i+"번째 수를 입력하세요");
						if(i==1) {num1 = sc.nextInt();}
						if(i==2) {num2 = sc.nextInt();}
						if(i==3) {num3 = sc.nextInt();}
						if(i==4) {num4 = sc.nextInt();}
						if(i==5) {num5 = sc.nextInt();}
					}
					if(cnt==2) {
						num = num1 + num2;
						System.out.println(num1+"+"+num2+"="+num);
					}
					if(cnt==4) {
						num = num1 + num2;
						System.out.println(num1+"+"+num2+"="+num);
					}
					if(cnt==5) {
						num = num1 + num2;
						System.out.println(num1+"+"+num2+"="+num);
					}
				}
			}
			if(k.equals("/")) {
				System.out.println("몇개의 숫자로 계산하시겠습니까");
				cnt = sc.nextInt();
				if(cnt==1 || cnt>5) {
					System.out.println("너무 적거나 많습니다.");
					continue;
				}else {
					for(int i=1; i <= cnt; i++) {
						System.out.println(i+"번째 수를 입력하세요");
						if(i==1) {num1 = sc.nextInt();}
						if(i==2) {num2 = sc.nextInt();}
						if(i==3) {num3 = sc.nextInt();}
						if(i==4) {num4 = sc.nextInt();}
						if(i==5) {num5 = sc.nextInt();}
					}
					if(cnt==2) {
						System.out.println((double)num1/num2);
					}
					if(cnt==3) {
						num = num1 + num2;
						System.out.println((double)num1/num2/num3);
					}
					if(cnt==4) {
						num = num1 + num2;
						num = num1 + num2;
						System.out.println((double)num1/num2/num3/num4);
					}
				}
			}			
			
		}
		
		
		
	}

}
