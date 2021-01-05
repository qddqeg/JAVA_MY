package Test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 999;
		int j = 40;
		String k = "65";
		
		int l = Integer.parseInt(k);
		int x = i*j;
		double result_1 = (double)x/l;
		double result_2 = (double)l/x*100;
				
		System.out.println(x);
		System.out.println(result_1);
		System.out.println(result_2+"%");
	
	}

}
