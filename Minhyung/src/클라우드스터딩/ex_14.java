package Ŭ���彺�͵�;
import java.util.Scanner;
public class ex_14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("// ������(kg) Ű(m) �� �Է�");
		double weight =sc.nextDouble();
		double tall=sc.nextDouble();
		double BMI=calculateBMI(weight,tall);
		 bmi(BMI);

	}
	public static double calculateBMI(double weight,double tall) {
		double tall_mult=tall*tall;
		double BMI=weight/tall_mult;
		
		return BMI;
	}
   public static void bmi(double BMI) {
	   if(BMI<18.5) {
		   System.out.println("��ü��");
	   }else if(BMI>=18.5&&BMI<25) {
		   System.out.println("����");
	   }else if(BMI>=25&&BMI<30) {
		   System.out.println("��ü��");
	   }else if(BMI>=30) {
		   System.out.println("��");
	   }
	   
   }
}
