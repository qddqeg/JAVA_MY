package Coding;
import java.util.Scanner;

public class Coding_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Coding_16_vol vol = new Coding_16_vol();
		Coding_16_ch ch = new Coding_16_ch();
		System.out.println("TV�� Ű���� 'ON'�� / ������ 'OFF'�� �Է��ϼ���");
		String yn = sc.next(); 

		if (yn.equals("ON")|| yn.equals("on")) { 

			System.out.println("TV�� �������ϴ�.");
			System.out.println("���ϴ� ����� �����ϼ���(�������� : vol / ä�μ��� : ch)");
			String k = sc.next();
			
			if(k.equals("vol")|| k.equals("VOL")){
				vol.main(args);
			}
			if(k.equals("ch")|| k.equals("CH")) {
				ch.main(args);
			}

		}

		if (yn.equals("OFF")|| yn.equals("off")) { 

			System.out.println("TV�� �������ϴ�."); // class off

		}
	}

}
