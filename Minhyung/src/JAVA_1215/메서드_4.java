package JAVA_1215;
import java.util.Scanner;
public class �޼���_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("���� ��ȭ �帣�� �����ϼ���.");
		System.out.println("==========================");
		System.out.println("1.SF 2.�׼� 3.��Ÿ�� ");
        int pick=sc.nextInt();
        switch(pick) {
        case 1:
        	System.out.println("�����Ͻ� ��ȭ�� SF�帣�Դϴ�.");
        	String array[]=new String[5];
        	array=movie();
        	for(String i: array) {
        		System.out.println(i);
        	}
        	break;
        	
        case 2:
        	System.out.println("�����Ͻ� ��ȭ�� �׼� �帣�Դϴ�.");
        	String array_1[]=new String[5];
        	array_1=movie_1();
        	for(String j: array_1) {
        		System.out.println(j);
        	}
        	break;
        case 3:
        	System.out.println("�����Ͻ� ��ȭ�� �׼� �帣�Դϴ�.");
        	String array_2[]=new String[5];
        	array_2=movie_2();
        	for(String k: array_2) {
        		System.out.println(k);
        	}
        	break;
        }
	}
	public static String[] movie() {
		String array[]= {"|1. ���ͽ��ڶ�","|2. ����","|3. �͹̳�����","|4. �κ�����","|5. �����ڵ�"};
		return array;
	}
	public static String[] movie_1() {
		String array_1[]= {"|1. �� �� 3","|2. ���","|3. �ý� �ݷ���","|4. �ٸ� �ǿ��� ���ϼҼ�","|5. �׸�����"};
		return array_1;
	}
	public static String[] movie_2() {
		String array_2[]= {"|1. �ظ�����","|2. �����Ǽ�Ʈ 2","|3. �׷��ڰ� ����","|4. �ĸ��� �ξ�","|5. ü��������"};
		return array_2;
	}
}
