package JAVA_1203;

public class string_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a ="ABCD";
//      String b ="ABCD";
        String b =new String("ABCD");
        
        System.out.println(a);
        System.out.println(b);
        
        if(a.equals(b)) {
        	System.out.println("둘은 같다.");
      } else  {
      
        	System.out.println("둘은 같지 않다.");
        	
        
	}

}
}