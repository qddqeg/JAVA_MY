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
			System.out.println("� ������ �Ͻðھ��? ( + - x / % )");
			String k =sc.next();
			
		/*	int x = Integer.parseInt(k);
			char y = (char)x;
			if(y<=48) {
				System.out.println("�߸� �Է��Ͽ����ϴ�. ��ȣ�� �Է����ּ���");
				
			}else if(y>=148) {
				System.out.println("�߸� �Է��Ͽ����ϴ�. ��ȣ�� �Է����ּ���");
			}
			*/
			
			if(k.equals("%")) {
				System.out.println("2���� ���ڸ� �Է��ϼ���");
				System.out.println("ù��° ���� �Է��ϼ���");
				num1 = sc.nextInt();
				System.out.println("�ι�° ���� �Է��ϼ���");
				num2 = sc.nextInt();
				System.out.println((double)num1/num2);
			}
			if(k.equals("+")) {
				System.out.println("��� ���ڷ� ����Ͻðڽ��ϱ�");
				cnt = sc.nextInt();
				if(cnt==1 || cnt>5) {
					System.out.println("�ʹ� ���ų� �����ϴ�.");
					continue;
				}else {
					for(int i=1; i <= cnt; i++) {
						System.out.println(i+"��° ���� �Է��ϼ���");
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
				System.out.println("��� ���ڷ� ����Ͻðڽ��ϱ�");
				cnt = sc.nextInt();
				if(cnt==1 || cnt>5) {
					System.out.println("�ʹ� ���ų� �����ϴ�.");
					continue;
				}else {
					for(int i=1; i <= cnt; i++) {
						System.out.println(i+"��° ���� �Է��ϼ���");
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
