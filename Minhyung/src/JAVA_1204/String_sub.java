package JAVA_1204;

public class String_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str = "AB345";                                        // |A|B|C|D|
		String num_str1 = "12BCD";
		String num_char = "ABC";                                     // Substring(0)= ABCD Substring(1,3)=BC
           
		 
		 String i =num_str.substring(2,5);           //문자 걸러내기
		 String j =num_str1.substring(0,2);
		 String k =num_char.substring(2);
		 
		 System.out.println(i);
		 System.out.println(j);
		 System.out.println(k);
		 
		int str_num =Integer.parseInt(i);      //문자를 숫자로 바꾸기
		int str_num1 =Integer.parseInt(j);
		char char_num =k.charAt(0);      
		
		System.out.println(str_num);
		System.out.println(str_num1);
		System.out.println(char_num);
		
		int sum = str_num + str_num1+char_num;
		
		System.out.println(sum);
		
	}

}
