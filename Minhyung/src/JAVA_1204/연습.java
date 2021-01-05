package JAVA_1204;

public class ¿¬½À {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str ="1234";
		 // String str_1 = "A123";
		  char c ='E';
		  
		  
		  
		  for(int i=0;i<str.length();i++) {
			 
			 String j = str.substring(i,i+1);
			 
			 int k =Integer.parseInt(j);
			  int mult = k*c;
			  System.out.println(mult);
			
		  }
		  

	}
}
