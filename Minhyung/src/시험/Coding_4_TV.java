package 시험;

import java.util.Scanner;

public class Coding_4_TV {
	static Scanner sc = new Scanner(System.in);

public static void CHANNEL(int pick, int channel) {
		System.out.println("시청하실 채널을 입력해주세요.");
		pick = sc.nextInt();
		channel = pick;
		System.out.println(channel + " 채널로 이동되었습니다.");

	}

}
