
public class Double_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		int j = 3;
		
		int result_1 = i / j;
		int result_2 = i % j;
		
		double result_3 = (double)i / (double)j;
		float result_4 = (float)i % (float)j;
		
		System.out.println("결과 1 : "+ result_1);
		System.out.println("결과 2 : "+ result_2);
		System.out.println("결과 3 : "+ result_3);
		System.out.println("결과 4 : "+ result_4);
	}

}
