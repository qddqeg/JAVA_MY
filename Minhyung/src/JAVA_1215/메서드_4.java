package JAVA_1215;
import java.util.Scanner;
public class 메서드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("보실 영화 장르를 선택하세요.");
		System.out.println("==========================");
		System.out.println("1.SF 2.액션 3.판타지 ");
        int pick=sc.nextInt();
        switch(pick) {
        case 1:
        	System.out.println("선택하신 영화는 SF장르입니다.");
        	String array[]=new String[5];
        	array=movie();
        	for(String i: array) {
        		System.out.println(i);
        	}
        	break;
        	
        case 2:
        	System.out.println("선택하신 영화는 액션 장르입니다.");
        	String array_1[]=new String[5];
        	array_1=movie_1();
        	for(String j: array_1) {
        		System.out.println(j);
        	}
        	break;
        case 3:
        	System.out.println("선택하신 영화는 액션 장르입니다.");
        	String array_2[]=new String[5];
        	array_2=movie_2();
        	for(String k: array_2) {
        		System.out.println(k);
        	}
        	break;
        }
	}
	public static String[] movie() {
		String array[]= {"|1. 인터스텔라","|2. 마션","|3. 터미네이터","|4. 인베이젼","|5. 구직자들"};
		return array;
	}
	public static String[] movie_1() {
		String array_1[]= {"|1. 존 웍 3","|2. 얼론","|3. 택스 콜렉터","|4. 다만 악에서 구하소서","|5. 그린랜드"};
		return array_1;
	}
	public static String[] movie_2() {
		String array_2[]= {"|1. 해리포터","|2. 말레피센트 2","|3. 그레텔과 헨젤","|4. 파리의 인어","|5. 체인지오버"};
		return array_2;
	}
}
