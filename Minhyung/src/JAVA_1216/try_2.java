package JAVA_1216;

import java.lang.reflect.Array;

public class try_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   String str="ABCDEF";
    	   for(int i=0;i<=str.length();i++) {
    		   String sub=str.substring(i,i+1);
    	   }
       }catch(IndexOutOfBoundsException e) {
    	   System.out.println("발생오류"+e);
       }
       try {String str="ABCDEF";
       		String array[] =new String[str.length()];
	   for(int i=0;i<=str.length();i++) {
		   String sub=str.substring(i,i+1);
		   array[i] = sub;
	   }
    	   
    	   }catch(ArrayIndexOutOfBoundsException e) {
    		   System.out.println("발생오류"+e);
       }
	}

}
