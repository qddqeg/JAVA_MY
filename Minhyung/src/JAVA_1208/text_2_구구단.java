package JAVA_1208;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class text_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		File file=new File("C:\\txt\\number.txt");
		//��ĳ�ʷ� ���� �б�
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split(" ");
			for (int i= 0; i<array.length; i+=3) {
				System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]); // 0x1=2 
				//i+=2; 2���� �ٽ� �������� ���ư��� +1�����ؼ� 3�� �� 
				
			}
		}
		
     
	}catch (FileNotFoundException e) {
		System.out.println(e);
	 }
	
	}
}
	   

	


