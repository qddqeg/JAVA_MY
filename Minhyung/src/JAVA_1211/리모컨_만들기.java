package JAVA_1211;

import java.util.Scanner;

public class ������_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// while ��
		boolean volume = true;
		boolean menu = true;
		boolean channel = true;
		// 
		int sound = 0;
		int chan=1;
		System.out.println("���� ��ư�� �����ּ���. ");
		System.out.println("on | off");
		String str = sc.next();
		if (str.equals("on")) {
			System.out.println("TV�� �����ϴ�.");
			System.out.println("________________________");
			System.out.println("|        ___           |");
			System.out.println("|    ___| 0 |     /    |");
			System.out.println("|   |___    |_____|    |");
			System.out.println("|       |  ______ |    |");
			System.out.println("|       |_|     |_|    |");
			System.out.println("|======================|");
			System.out.println("-------------------------");
			while (menu) {
				System.out.println(" 1.����  2.ä��");
				int pick = sc.nextInt();
				if (pick == 1) {
					System.out.println("���� ��ư�� �����̽��ϴ�.");
					volume=true;
					while (volume) {
						System.out.println("|1.���� up |2.���� Down |3.���Ұ� | 4.back|");
						pick = sc.nextInt();

						if (sound == 40) {
							System.out.println("�Ҹ��� ���̻� �ø��� �����ϴ�.");
							System.out.println("���� ������: " + sound);
						} else if (sound < 40) {
							if (pick == 1) {
								sound += 1;
								System.out.println("+1");
								System.out.println("���� ������: " + sound);
							}
						}
						if (sound == 0) {
							System.out.println("�Ҹ��� ���̻� ������ �����ϴ�.");
							System.out.println("���� ������: " + sound);
						} else if (sound > 0) {
							if (pick == 2) {
								sound -= 1;
								System.out.println("-1");
								System.out.println("���� ������: " + sound);
							}
						}
						if (pick == 3) {
							sound = 0;
							System.out.println("���Ұ�");
							System.out.println("���� ������: " + sound);
						}
						if (pick == 4) {
							System.out.println("===================");
							System.out.println("�Ҹ� ���� �� �ڷ� ���ϴ�.");
							System.out.println("===================");
							volume = false;
						}

					}
				}//ä�� ����â
				
				if(pick==2) {
					
					System.out.println("ä�� ��ư�� �����̽��ϴ�.");
					channel=true;
					while(channel) {
						
						System.out.println("|1.ä�� up |2.ä�� Down |3.ä�� �̵� |4.back|");
						pick = sc.nextInt();

						if (chan >=100) {
							chan=1;
							System.out.println("100ä�� �Դϴ� �ٽ� "+chan+" ä�η� ���ư��ϴ�.");
							System.out.println("���� ä����: " +chan+" ä�� �Դϴ�." );
						} else if (chan <100) {
							if (pick ==1) {
								chan += 1;
							System.out.println("���� ��û�Ͻô� ä����: " + chan+" ä�� �Դϴ�.");
							}
						}
						if (chan <1) {
							chan=100;
							System.out.println("1ä�� �Դϴ� �ٽ� "+chan+" ä�η� ���ư��ϴ�.");
							System.out.println("���� ä����: " +chan+" ä�� �Դϴ�." );
						} else if (chan >=1) {
							if (pick == 2) {
								chan -= 1;
						    System.out.println("���� ä����: " +chan+" ä�� �Դϴ�." );
							}
						}
						if(pick==3) {
							System.out.println("�̵��Ͻ� ä���� �Է����ּ���.");
							int pick_num = sc.nextInt();
							chan=pick_num;
							System.out.println("���� ä����"+chan+" ä�� �Դϴ�.");
							 
						}
						if (pick == 4) {
							System.out.println("===================");
							System.out.println("ä�� ���� �� �ڷ� ���ϴ�.");
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
	

