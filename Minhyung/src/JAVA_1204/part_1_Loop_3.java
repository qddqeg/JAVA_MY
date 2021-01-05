package JAVA_1204;

public class part_1_Loop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int j = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%2==0) {
				j+=i;  //+= j에다가 i값을 더함
				System.out.println(j);
			}
			
		}
		System.out.println("1~100의 짝수일 떄 합은 :"+j);
		
		
	}

}
