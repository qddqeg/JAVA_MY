package JAVA_1208;
import java.util.Scanner;
public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        String str=sc.next();
//         
//        String array_str[] = new String[str.length()];
//       // String sub ="";
//        for(int i = 0; i<str.length(); i++) {
//        	array_str[i] = str.substring(i,+i+1);
//        	
//        }
//        System.out.println(array_str[0]);
//        System.out.println(array_str[1]);
//        System.out.println(array_str[2]);
//        System.out.println(array_str[3]);
//        System.out.println(array_str[4]);
//        System.out.println(array_str[5]);
//        
		
		Scanner n =new Scanner(System.in);
		
		System.out.println("엔터 스트링 오프 테스트");
		String b = n.nextLine();
		String c[]=b.split("@");
		System.out.println(c.length);
		System.out.println(c[0]);
		System.out.println(c[1]);
		
//		for(int i =0; i<c.length; i++) {
//			System.out.println(c[i]);
//			
//		}
	} 

} 
