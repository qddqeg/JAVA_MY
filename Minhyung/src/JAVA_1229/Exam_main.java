package JAVA_1229;

import java.util.Scanner;

public class Exam_main {

	public static void main(String[] args) {
		Exam exam = new Exam();
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {
		int kor=exam.getKor();
		int eng=exam.getEng();
		int math=exam.getMath();
		int Social=exam.getSocial();
		int Science=exam.getScience();
		System.out.println("----------------------------------------------------------");
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = kor + eng + math + Social + Science;
		double avg = total / 5.0;

		System.out.printf("���� : %d\n",kor );
		System.out.printf("���� : %d\n",eng );
		System.out.printf("���� : %d\n", math);
		System.out.printf("��ȸ : %d\n", Social);
		System.out.printf("���� : %d\n", Science);

		System.out.printf("���� : %d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
		System.out.println("----------------------------------------------------------");
		System.out.println("|         ���� �Է�                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		String subject[]= {"����","����","����","��ȸ","����"};
		for(int i=0;i<subject.length; i++) {
			if(i==0) {
				exam.setKor(do_process(subject[i]));
			}else if(i==1) {
				exam.setEng(do_process(subject[i]));
			}else if(i==2) {
				exam.setMath(do_process(subject[i]));
			}else if(i==3) {
				exam.setSocial(do_process(subject[i]));
			}else if(i==4) {
				exam.setScience(do_process(subject[i]));
			}
		}
		
		
//		exam.setKor(do_process(korl));
//		exam.setEng(do_process(engl));
//		exam.setMath(do_process(maths));
//		exam.setSocial(do_process(Socials));
//		exam.setScience(do_process(Sciences));
//		

	}
	
	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + " ������ 0~100������ ������ �Է����ּ���.");
		} while (num < 0 || 100 < num);
	
		System.out.println("----------------------------------------------------------");
	return num;	
	}
}