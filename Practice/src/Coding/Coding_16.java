package Coding;
import java.util.Scanner;

public class Coding_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Coding_16_vol vol = new Coding_16_vol();
		Coding_16_ch ch = new Coding_16_ch();
		System.out.println("TV를 키려면 'ON'를 / 끄려면 'OFF'를 입력하세요");
		String yn = sc.next(); 

		if (yn.equals("ON")|| yn.equals("on")) { 

			System.out.println("TV가 켜졌습니다.");
			System.out.println("원하는 기능을 선택하세요(볼륨조절 : vol / 채널선택 : ch)");
			String k = sc.next();
			
			if(k.equals("vol")|| k.equals("VOL")){
				vol.main(args);
			}
			if(k.equals("ch")|| k.equals("CH")) {
				ch.main(args);
			}

		}

		if (yn.equals("OFF")|| yn.equals("off")) { 

			System.out.println("TV가 꺼졌습니다."); // class off

		}
	}

}
