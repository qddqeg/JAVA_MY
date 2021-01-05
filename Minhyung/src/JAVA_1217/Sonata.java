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
	System.out.println("나는 "+ model+ " 다.");
	System.out.println("내 주인은 "+ owner+" 님이야");
	System.out.println("나를 만든 자는 "+ brand);
	System.out.println("내 최고속도는 : "+ maxspeed+" km");
	System.out.println("난 이만큼 달려왔어 :  "+ km+" km");
}
}
