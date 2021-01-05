package JAVA_1208;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class text_2_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		File file=new File("C:\\txt\\number.txt");
		//스캐너로 파일 읽기
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split(" ");
			for (int i= 0; i<array.length; i+=3) {
				System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]); // 0x1=2 
				//i+=2; 2증강 다시 포문으로 돌아갈떄 +1증강해서 3씩 됨 
				
			}
		}
		
     
	}catch (FileNotFoundException e) {
		System.out.println(e);
	 }
	
	}
}
	   

	


