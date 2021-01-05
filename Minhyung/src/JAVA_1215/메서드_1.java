package JAVA_1215;

public class ¸Ş¼­µå_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i =10;
       a(i);
	}

	public static void a(int i) {
	  int sum=i+10;
	  b(sum);
	}
	
	

	public static void b(int sum) {
		int sum_1=sum+10;
		int sum_2=c(sum_1);
		d(sum_2);
		
	}
	public static int c(int sum_1) {
		int sum_2=sum_1+10;
		return sum_2;
	}
	public static void d(int sum_2 ) {
		int sum_3=sum_2+10;
		System.out.println(sum_3);
	}
}
