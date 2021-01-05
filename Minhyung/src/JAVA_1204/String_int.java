package JAVA_1204;
import java.util.Scanner;
public class String_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num_str ="12345";
		
		System.out.println("String 형 :"+num_str);
		
		int str_num =Integer.parseInt(num_str);   //주로 사용 문자를 숫자로 바꿔주는것
		
		int str_num_1 =Integer.valueOf(num_str);  // 숫자 범위 작아서 잘사용 하지 않음
		
		System.out.println("int 형_pars :"+str_num);
		System.out.println("int 형_valu :"+str_num_1);
		String sum =num_str+10; //문자로 취급
		int sum_1 =str_num+10; //숫자로 취급
		
		System.out.println("문자이기떄문에 더해지지 않는다"+sum);
		System.out.println("문자를 숫자로 바꿔줬기 때문에 더해진다: "+sum_1);
	}

}
