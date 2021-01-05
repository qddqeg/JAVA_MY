package JAVA_1208;
import java.util.Scanner;
public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("문자를 입력해주세요.");
          String str = sc.nextLine();
          String a[] = str.split("-|;|@"); //split은 입력값 str 에서 ("@") 문장을 어디서 끊어줄것인지 정해준다.
          
          for(int i=0; i<a.length; i++) { //끊어준 a에 length 길이를 재준다.
        	  System.out.println(a[i]); //잘 끊어줬는지 확인
        	  int leng =a[i].length();  //끊어준 문장에 길이를 재준다 Ex AAA BBB CCC 길이는 3개가 된다.  
        	  
        	  for(int j=0; j<leng; j++) { 
        		  String sub = a[i].substring(j,j+1); //끊어놓은 문장 "a[i]"를 substring으로 한번더 그안에서 하나씩 잘라낸다.
        		  
        		//  System.out.println(sub); //확인!!
        	  }
        	  
 
          }
          
	}

}
