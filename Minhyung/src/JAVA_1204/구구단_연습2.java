package JAVA_1204;

public class 구구단_연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0;
        int j=0;
        
        for(i=2;i<=9; i++) {
        	System.out.println("구구단을 시작하겠습니다.");
        	for(j=1;j<=9; j++) {
        		int k = i*j;
        		System.out.println(i+"X"+j+"="+k);
        		
        	}
        }
	}

}
