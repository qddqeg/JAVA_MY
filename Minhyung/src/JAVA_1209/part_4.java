package JAVA_1209;
import java.util.Scanner;
public class part_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("글자를 입력해주세요");
        String str=sc.next();
        String str_1[]=new String[100];
        int str_2[]=new int[100];
        int sum=0;
        int leng=str.length();
        boolean bo =str.contains("0")||str.contains("1")||str.contains("2")||str.contains("3")||
        		  str.contains("4")||str.contains("5")||str.contains("6")||str.contains("7")||
        		  str.contains("8")||str.contains("9");
               //contains() 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
        
       
        
        
        
        for(int i=0; i<leng; i++) {
        	str_1[i] =str.substring(i,i+1); //한글자씩 자른거
        	//System.out.println(str_1[i]);
        	
        	if(bo==true) {
        		str_2[i]=Integer.parseInt(str_1[i]);
        		sum+=str_2[i];
        		System.out.println(sum);
        	}
        	
        
            	
            
        }
        

        	
        
	}

}
