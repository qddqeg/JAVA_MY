package JAVA_0104;

import java.util.Scanner;

public class Class_A_list {
	Class_B[] Class_B_array;
	int current; 
	
	public Class_A_list() {
		Class_B_array = new Class_B[3];
				current = 0;
		
	}
 
	public static void plus(Class_A_list list) {
		
		Scanner sc = new Scanner(System.in);
		// 객체 생성 뒤, 값 입력
		System.out.println("연산자를 입력해주세요.(+,-,*,/)");
		String str=sc.next();
		Class_B B1 = new Class_B();
		switch(str) {
		case "+":
			
			System.out.println(list.current + 1 + "번째 배열의 첫번째 값 입력");
			B1.num_1 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 두번째 값 입력");
			B1.num_2 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 세번째 값 입력");
			B1.num_3 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 네번째 값 입력");
			B1.num_4 = sc.nextInt();
			B1.lesult = B1.num_1 + B1.num_2+B1.num_3+B1.num_4;
			
			// 매개변수 배열 객체에 값 담기
			list.Class_B_array[list.current] = B1;
			list.current++;
			break;
		case "-":
			System.out.println(list.current + 1 + "번째 배열의 첫번째 값 입력");
			B1.num_1 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 두번째 값 입력");
			B1.num_2 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 세번째 값 입력");
			B1.num_3 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 네번째 값 입력");
			B1.num_4 = sc.nextInt();
			B1.lesult = B1.num_1 - B1.num_2-B1.num_3-B1.num_4;
			
			// 매개변수 배열 객체에 값 담기
		
						list.Class_B_array[list.current] = B1;
						list.current++;
						break;
		case "*":
			System.out.println(list.current + 1 + "번째 배열의 첫번째 값 입력");
			B1.num_1 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 두번째 값 입력");
			B1.num_2 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 세번째 값 입력");
			B1.num_3 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 네번째 값 입력");
			B1.num_4 = sc.nextInt();
			B1.lesult = B1.num_1 * B1.num_2*B1.num_3*B1.num_4;
			
			// 매개변수 배열 객체에 값 담기
						list.Class_B_array[list.current] = B1;
						list.current++;
						break;
		case "/":
			System.out.println(list.current + 1 + "번째 배열의 첫번째 값 입력");
			B1.num_1 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 두번째 값 입력");
			B1.num_2 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 세번째 값 입력");
			B1.num_3 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 네번째 값 입력");
			B1.num_4 = sc.nextInt();
			
			double division =(double)B1.num_1/(double)B1.num_2/(double)B1.num_3/(double)B1.num_4;
			B1.lesult=(int)division;
			
			// 매개변수 배열 객체에 값 담기
						list.Class_B_array[list.current] = B1;
						list.current++;
						break;			
		}
	      
	}
	public static void print(Class_A_list list) {
		for (int i = 0; i < list.current; i++) {
			// B1 객체 다시 생성 뒤 값 담기.
			Class_B B1 = list.Class_B_array[i];
			System.out.println("첫번째 값 :: " + B1.num_1);
			System.out.println("두번째 값 :: " + B1.num_2);
			System.out.println("합 :: " + B1.lesult);
		}
	}
}