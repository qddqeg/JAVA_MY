package JAVA_1217;
import java.util.Scanner;
public class class_6 {
static String mycard="īī����ũ ī��";
static int mymoney=10000000;
static String name="�����";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm= new ATM();
		atm.Lookup(name,mycard);
		atm.menu(mymoney);
		
        
	}

}
