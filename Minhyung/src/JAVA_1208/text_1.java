package JAVA_1208;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class text_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
	    //���� ��ü ����
		File file=new File("C:\\txt\\txt.txt");
		//��ĳ�ʷ� ���� �б�
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split("-|;");
			for (int i= 0; i<array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
     
	}catch (FileNotFoundException e) {
		System.out.println(e);
	 }
	   
	}
}
