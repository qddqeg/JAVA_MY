package Cal;

public class For_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
		for(j=1; j<=100; j++) {
			i+=j; // i+ = j까지의 합
			System.out.println("현재 i = " +i);
			System.out.println("현재 j = " +j);
		}
		System.out.println("1~"+(j-1)+"합 :"+ i);
	}

}
