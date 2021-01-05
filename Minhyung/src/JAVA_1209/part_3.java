package JAVA_1209;

import java.util.Scanner;

public class part_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		String str = sc.next();
		int i = 0;
		int leng = str.length();
		//System.out.println(leng);
		if(leng%2==1) {        //입력한 글자 길이가 홀수이면 str=str+한칸추가해줘서 두칸을 만들어준후 
			 str= str+" ";
			
		 }                             //(가나다라마) 일때 (가나다라마||)로 만들어놓고 입력해라
	
		for (i = 0; i < str.length(); i++) {
			 String sub = str.substring(i, i+2); 
				i++;
				System.out.println(sub);  //(가나) (다라) (마||)로 입력된다.
		
			 
				
			 
			
		}

	}

}
