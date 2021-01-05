package JAVA_1214;

public class 쉬운거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i= 10;
     int j= 20;
     int sum=0;
     sum=plus(i,j,sum);
     System.out.println("sum 값은 : "+sum);
     
	}
    public static int plus(int i,int j,int sum) {
     sum=i+j;

      return sum;
    }
}
