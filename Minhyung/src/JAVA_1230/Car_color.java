package JAVA_1230;

public class Car_color  {
static String col_1="blue";
static String col_2="yellow";
static String col_3="Red";
static String col_4="black";
static String col_5="White";


public static void ran_color() {
	int ran=(int)(Math.random()*5)+1;
	switch(ran) {
	case 1:
		System.out.println("������ "+col_1+" �Դϴ�.");
		break;
	case 2:
		System.out.println("������ "+col_2+" �Դϴ�.");
		break;
	case 3:
		System.out.println("������ "+col_3+" �Դϴ�.");
		break;
	case 4:
		System.out.println("������ "+col_4+" �Դϴ�.");
		break;
	case 5:
		System.out.println("������ "+col_5+" �Դϴ�.");
		break;
	
	}
}
}