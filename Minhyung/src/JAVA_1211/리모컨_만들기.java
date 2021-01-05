package JAVA_1211;

import java.util.Scanner;

public class 리모컨_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// while 문
		boolean volume = true;
		boolean menu = true;
		boolean channel = true;
		// 
		int sound = 0;
		int chan=1;
		System.out.println("전원 버튼을 눌러주세요. ");
		System.out.println("on | off");
		String str = sc.next();
		if (str.equals("on")) {
			System.out.println("TV가 켜집니다.");
			System.out.println("________________________");
			System.out.println("|        ___           |");
			System.out.println("|    ___| 0 |     /    |");
			System.out.println("|   |___    |_____|    |");
			System.out.println("|       |  ______ |    |");
			System.out.println("|       |_|     |_|    |");
			System.out.println("|======================|");
			System.out.println("-------------------------");
			while (menu) {
				System.out.println(" 1.음량  2.채널");
				int pick = sc.nextInt();
				if (pick == 1) {
					System.out.println("음량 버튼을 누르셨습니다.");
					volume=true;
					while (volume) {
						System.out.println("|1.볼륨 up |2.볼륨 Down |3.음소거 | 4.back|");
						pick = sc.nextInt();

						if (sound == 40) {
							System.out.println("소리를 더이상 올릴수 없습니다.");
							System.out.println("현재 볼륨은: " + sound);
						} else if (sound < 40) {
							if (pick == 1) {
								sound += 1;
								System.out.println("+1");
								System.out.println("현재 볼륨은: " + sound);
							}
						}
						if (sound == 0) {
							System.out.println("소리를 더이상 내릴수 없습니다.");
							System.out.println("현재 볼륨은: " + sound);
						} else if (sound > 0) {
							if (pick == 2) {
								sound -= 1;
								System.out.println("-1");
								System.out.println("현재 볼륨은: " + sound);
							}
						}
						if (pick == 3) {
							sound = 0;
							System.out.println("음소거");
							System.out.println("현재 볼륨은: " + sound);
						}
						if (pick == 4) {
							System.out.println("===================");
							System.out.println("소리 설정 끝 뒤로 갑니다.");
							System.out.println("===================");
							volume = false;
						}

					}
				}//채널 선택창
				
				if(pick==2) {
					
					System.out.println("채널 버튼을 누르셨습니다.");
					channel=true;
					while(channel) {
						
						System.out.println("|1.채널 up |2.채널 Down |3.채널 이동 |4.back|");
						pick = sc.nextInt();

						if (chan >=100) {
							chan=1;
							System.out.println("100채널 입니다 다시 "+chan+" 채널로 돌아갑니다.");
							System.out.println("현재 채널은: " +chan+" 채널 입니다." );
						} else if (chan <100) {
							if (pick ==1) {
								chan += 1;
							System.out.println("현재 시청하시는 채널은: " + chan+" 채널 입니다.");
							}
						}
						if (chan <1) {
							chan=100;
							System.out.println("1채널 입니다 다시 "+chan+" 채널로 돌아갑니다.");
							System.out.println("현재 채널은: " +chan+" 채널 입니다." );
						} else if (chan >=1) {
							if (pick == 2) {
								chan -= 1;
						    System.out.println("현재 채널은: " +chan+" 채널 입니다." );
							}
						}
						if(pick==3) {
							System.out.println("이동하실 채널을 입력해주세요.");
							int pick_num = sc.nextInt();
							chan=pick_num;
							System.out.println("현재 채널은"+chan+" 채널 입니다.");
							 
						}
						if (pick == 4) {
							System.out.println("===================");
							System.out.println("채널 설정 끝 뒤로 갑니다.");
							System.out.println("===================");
							channel = false;
						}

					}
					}
				}
			}
		
		
		}
	
	
	
	
	public static int b() {
		
		return 0;
	}
		
	}
	

