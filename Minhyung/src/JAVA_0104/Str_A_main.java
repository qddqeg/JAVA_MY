package JAVA_0104;

public class Str_A_main {

	public static void main(String[] args) {
		Str_C c=new Str_C();
		c.Str_C();
		int sum=0;
		for(int i=0;i<c.B.str.length();i++) {
			String sub=c.B.str.substring(i,i+1);
			int idx=Integer.parseInt(sub);
			sum=c.B.c+idx;
			System.out.println(sum);
		}
		
	} 

}
