package JAVA_1216;

public class try_1 {

	public static void main(String[] args) {
		
      try {
    	  String str="ABCDE";
    	  for(int i=0;i<=str.length();i++) {
    		  String sub=str.substring(i,i+1);
    	  }
      }catch(IndexOutOfBoundsException e) {
    	  System.out.println(e);
    	  
      }catch(ArithmeticException e) {
    	 System.out.println(e);
      }finally {
    	  
      }
	}

}
