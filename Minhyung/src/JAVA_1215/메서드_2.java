package JAVA_1215;
import java.util.Scanner;
public class �޼���_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
         String str= sc.nextLine();
         int leng=a(str);
         
         String str_array[]=new String[100];
         str_array=b(str,leng);
         print(str_array);
         
         
	}
    public static int a(String str) {
    	int leng=str.length();
    	
    	return leng;
    }
    public static String[] b(String str,int leng) {
    	String str_array[] = new String[leng];
    	for(int i=0; i<leng; i++) {
    		str_array[i]=str.substring(i,i+1);
    	}
    	
    	return str_array;
    }
    public static void print(String str_array[]) {
    	for(String j:str_array) {
    		System.out.println(j);
    	}
    }
}
