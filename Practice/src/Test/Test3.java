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
		System.out.println("c의 값 : "+x);
		System.out.println("i를 c로 나눈 값 : "+z);
		System.out.println("k 값 :"+y);
		
		boolean b = (z==y);	
		System.out.println(b);

	}

}
