package JAVA_1208;
import java.util.Scanner;
public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("���ڸ� �Է����ּ���.");
          String str = sc.nextLine();
          String a[] = str.split("-|;|@"); //split�� �Է°� str ���� ("@") ������ ��� �����ٰ����� �����ش�.
          
          for(int i=0; i<a.length; i++) { //������ a�� length ���̸� ���ش�.
        	  System.out.println(a[i]); //�� ��������� Ȯ��
        	  int leng =a[i].length();  //������ ���忡 ���̸� ���ش� Ex AAA BBB CCC ���̴� 3���� �ȴ�.  
        	  
        	  for(int j=0; j<leng; j++) { 
        		  String sub = a[i].substring(j,j+1); //������� ���� "a[i]"�� substring���� �ѹ��� �׾ȿ��� �ϳ��� �߶󳽴�.
        		  
        		//  System.out.println(sub); //Ȯ��!!
        	  }
        	  
 
          }
          
	}

}
