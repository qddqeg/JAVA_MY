package Coding;

public class Coding_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k = "ABCDE";
		int i = 0;
		int sum =0;
		
		for(i=0; i<k.length(); i++) {
			sum += k.charAt(i);
		}
		System.out.println(sum);
	}
}
