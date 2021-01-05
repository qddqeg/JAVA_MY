package JAVA_1214;

public class part_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i =10;
    	 int j= 20;
    	int hap=plus(i,j);
    	System.out.println(hap);
	}
public static int plus(int i,int j) {
	int hap=i+j;
	int sum=minus(hap);
	return sum;
}
public static int minus(int hap) {
	int sum=hap-5;
	return sum;
}
}
