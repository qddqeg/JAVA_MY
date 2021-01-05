package JAVA_1204;

public class part_3_loop_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str ="ABCDEF";
        
        char c =str.charAt(1);
        System.out.println("CharAt : "+c);
        
        for(int i = 0 ; i <str.length();i++) {//I<= =À»»©¸é A B C D E F ¸¸ ÂïÈû
        	System.out.println(str.substring(i,i+1)); //Â©·Á³ª°¨ ,i+1ÇÏ¸é ÇÏ³ª¾¿ ³ª¿È
        	        }
		
//		String str1="ABC";
//		String str2="abc";
//		char c_1= ' ';
//		char c_2=' ';
//		
//		 for(int i = 0; i<str1.length(); i++) {
//			 c_1=str1.charAt(i);  //ABC
//			 
//		 } System.out.println(c_1);
//		
//		 for(int j =0; j<str1.length(); j++) {
//			 c_2=str2.charAt(j); //abc
//			 
//		 } System.out.println(c_2); 
//		 
//		 System.out.println(c_1+c_2);
//		
		
	}

	
	}


