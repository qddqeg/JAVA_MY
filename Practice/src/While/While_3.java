package While;
import java.util.Scanner;
public class While_3 {

public static void main(String[] args) {

boolean stop = false;

int num;

while (!stop) { 

System.out.println("�ΰ��� ������ �Է��ϼž��մϴ�.");

Scanner sc = new Scanner(System.in);

System.out.println("ù��° ���� �Է��ϼ���.");

int num1 = sc.nextInt(); 

System.out.println("�ι�° ���� �Է��ϼ���.");

int num2 = sc.nextInt();

System.out.println("����° ���� �Է��ϼ���.");

int num3 = sc.nextInt();

System.out.println("� ������ �Ͻðھ��? + - x / %");

String k = sc.next();

//System.out.println("sc"+k);

if(k.equals("X")) {

num = num1 * num2 * num3; 

System.out.println(num1 + " X " + num2 + " X " + num3+" = "+num);

}

if(k.equals("+")) { 

num = num1 + num2 + num3; 

System.out.println(num1 + " + " + num2 + "+ " + num3+" = "+num);

}

if(k.equals("-")) { 

num = num1 - num2 - num3; 

System.out.println(num1 + " - " + num2 + " - " + num3+" = "+num);

}

if(k.equals("/")) { 

num = num1 / num2 / num3; 

System.out.println(num1 + " / " + num2 + " / " + num3+" = "+num);

}

if(k.equals("%")) { 
	System.out.println(num1+","+num2+","+num3+"�߿��� ���ڸ� �����ϼ���");
	int frist = sc.nextInt();
	System.out.println(num1+","+num2+","+num3+"�߿��� �и� �����ϼ���");
	int second = sc.nextInt();
	System.out.println((double)frist/second*100);

}


System.out.println("��� Y, ���� N �Է�");

String yn = sc.next(); 

if (yn.equals("Y") || yn.equals("y")) { 

System.out.println("---------------------");

continue; 

}

if (yn.equals("N") || yn.equals("n")) { 

break; 

}

}

System.out.println("�ý����� ����Ǿ����ϴ�.");

}

}