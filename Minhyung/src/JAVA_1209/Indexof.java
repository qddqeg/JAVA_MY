package JAVA_1209;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("C:\\txt\\number_1.txt");
			//��ĳ�ʷ� ���� �б�
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				int idx =str.indexOf("");
				System.out.println(" �ε�����ȣ"+idx);
				
				String sub_1=str.substring(idx,idx+1);
				
				
				String sub_2=str.substring(idx,str.length());
				System.out.println("�ҷ��� ��� ���� : "+sub_2);
				
				String array[] = str.split("\\+");
				int sum=0;
				for (int i= 0; i<array.length; i++) {
					//System.out.println("�ҷ��� 32��328�� ������");
					//System.out.println(array[i]);
				    
					int str_num =Integer.parseInt(array[i]);
					System.out.println("�ڸ� ���ڸ� ���ڷ� �ٲ� : "+str_num);
					
					sum+=str_num;
					System.out.println(sum);
					
				}
				
			}
			
	     
		}catch (FileNotFoundException e) {
			System.out.println(e);
		 }
	}

}
