package JAVA_1208;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class text_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
	    //파일 객체 생성
		File file=new File("C:\\txt\\txt.txt");
		//스캐너로 파일 읽기
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
