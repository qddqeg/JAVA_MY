package JAVA_1209;

import java.util.Scanner;

public class part_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.next();
		int i = 0;
		int leng = str.length();
		//System.out.println(leng);
		if(leng%2==1) {        //�Է��� ���� ���̰� Ȧ���̸� str=str+��ĭ�߰����༭ ��ĭ�� ��������� 
			 str= str+" ";
			
		 }                             //(�����ٶ�) �϶� (�����ٶ�||)�� �������� �Է��ض�
	
		for (i = 0; i < str.length(); i++) {
			 String sub = str.substring(i, i+2); 
				i++;
				System.out.println(sub);  //(����) (�ٶ�) (��||)�� �Էµȴ�.
		
			 
				
			 
			
		}

	}

}
