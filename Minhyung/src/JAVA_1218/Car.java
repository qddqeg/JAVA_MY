package JAVA_1218;

public class Car {

	String Brand = "Benz";
	String color = "";
	int cc = 0;
	int door = 0;

	public Car(String Brand, String color, int cc, int door) {
		this.Brand = Brand;
		this.color = color;
		this.cc = cc;
		this.door = door;
	}

	public Car(String Brand, int cc, int door) {
		this(Brand, "³ë¶õ»ö", cc, door);
	}

	public Car(String Brand) {
		this(Brand, "Èò»ö", 2000, 2);
	}
	
	public Car(String Brand,int door) {
		this(Brand,"Èò»ö",2000, door);
		
	}

}
