package JAVA_1218;

public class Car_main {

	public static void main(String[] args) {
		String Brand= "Benz";
		String color= "°ËÀº»ö";
		int cc= 4000;
		int door = 4;
		
		
		Car car_1=new Car(Brand,color,cc,door);
		System.out.println("1. "+car_1.Brand);
		System.out.println("1. "+car_1.color);
		System.out.println("1. "+car_1.cc);
		System.out.println("1. "+car_1.door);
		
		Car car_2=new Car(Brand,cc,door);//³ë¶õ»ö 4000 4
		System.out.println("2. "+car_2.Brand);
		System.out.println("2. "+car_2.color);
		System.out.println("2. "+car_2.cc);
		System.out.println("2. "+car_2.door);
		
		Car car_3=new Car(Brand);//Èò»ö 2000 2
		System.out.println("3. "+car_3.Brand);
		System.out.println("3. "+car_3.color);
		System.out.println("3. "+car_3.cc);
		System.out.println("3. "+car_3.door);
		
		Car car_4=new Car(Brand,door);//Èº»ö 2000 4
		System.out.println("4. "+car_4.Brand);
		System.out.println("4. "+car_4.color);
		System.out.println("4. "+car_4.cc);
		System.out.println("4. "+car_4.door);
		
       
	}

}
