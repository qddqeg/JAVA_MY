package JAVA_1215;

public class 로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Lotto[] = new int[6];
		int pick_1 = (int) (Math.random() * 45) + 1;
		int pick_2 = (int) (Math.random() * 45) + 1;
		int pick_3 = (int) (Math.random() * 45) + 1;
		int pick_4 = (int) (Math.random() * 45) + 1;
		int pick_5 = (int) (Math.random() * 45) + 1;
		int pick_6 = (int) (Math.random() * 45) + 1;
		
		int[] Lotto_1 = Lo(pick_1,pick_2,pick_3,pick_4,pick_5,pick_6 ,Lotto);
	    for(int i=0; i<Lotto_1.length; i++) {
	    	if( Lotto_1[i]==pick_1||Lotto_1[i]==pick_2||Lotto_1[i]==pick_3||Lotto_1[i]==pick_4||Lotto_1[i]==pick_5||Lotto_1[i]==pick_6) {
	    		System.out.println("다시돌립니다.");
	    		i=i-1;
	    		break;
	    	}
	    }
	    for(int k:Lotto_1) {
	    	System.out.println(k);
	    }

	}

	public static int[] Lo(int pick_1,int pick_2, int pick_3,int pick_4,int pick_5,int pick_6, int Lotto[]) {
		
			Lotto[0] = pick_1;
			Lotto[1] = pick_2;
			Lotto[2] = pick_3;
			Lotto[3] = pick_4;
			Lotto[4] = pick_5;
			Lotto[5] = pick_6;
			
		

		return Lotto;
	}
}
