package JAVA_1217;

public class Sonata {
static String model = "Sonata";
static String brand = "Hyundai";
static String owner = "";
static int maxspeed = 250;
static int km= 0;

public Sonata(int maxspeed,int km,String name) {
	this.maxspeed =maxspeed;
	this.km=km;
	this.owner = name;
	//run(model,brand,maxspeed,km,owner);
	
}
public static void run() {
	System.out.println("���� "+ model+ " ��.");
	System.out.println("�� ������ "+ owner+" ���̾�");
	System.out.println("���� ���� �ڴ� "+ brand);
	System.out.println("�� �ְ�ӵ��� : "+ maxspeed+" km");
	System.out.println("�� �̸�ŭ �޷��Ծ� :  "+ km+" km");
}
}
