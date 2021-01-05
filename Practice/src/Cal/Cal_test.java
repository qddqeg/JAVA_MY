package Cal;

public class Cal_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int j = 1;
		
		int result_1 = i-- +10;
		int result_2 = --j +10;
		
		
		System.out.println("i 값 :"+result_1);
		System.out.println("j 값 :"+result_2);
		
		--result_1;
		result_2--;
		
		System.out.println("=====================");
		System.out.println("결과 1 : "+ result_1);
		System.out.println("결과 2 : "+ result_2);
		
		
	}

}
