package JAVA_1209;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("C:\\txt\\number_1.txt");
			//스캐너로 파일 읽기
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				int idx =str.indexOf("");
				System.out.println(" 인덱스번호"+idx);
				
				String sub_1=str.substring(idx,idx+1);
				
				
				String sub_2=str.substring(idx,str.length());
				System.out.println("불러온 모든 문장 : "+sub_2);
				
				String array[] = str.split("\\+");
				int sum=0;
				for (int i= 0; i<array.length; i++) {
					//System.out.println("불러온 32와328에 문자형");
					//System.out.println(array[i]);
				    
					int str_num =Integer.parseInt(array[i]);
					System.out.println("자른 문자를 숫자로 바꿈 : "+str_num);
					
					sum+=str_num;
					System.out.println(sum);
					
				}
				
			}
			
	     
		}catch (FileNotFoundException e) {
			System.out.println(e);
		 }
	}

}
