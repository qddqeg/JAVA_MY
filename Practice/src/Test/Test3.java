package Test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 900;
		byte c ='C';
		String k ="120";
		
		int x = (int)c;
		int y = Integer.parseInt(k);
		double z = (double) i/x;
		System.out.println("c�� �� : "+x);
		System.out.println("i�� c�� ���� �� : "+z);
		System.out.println("k �� :"+y);
		
		boolean b = (z==y);	
		System.out.println(b);

	}

}
