package JAVA_1221;
import java.util.Scanner;
public class men_1 {
 static int kg_1=60;
 static int floor_1;
 static int kg_2=50;
 static int floor_2;
 static int sum_kg=kg_1+kg_2;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Elevator elev_1=new Elevator();
		elev_1.Elevator(kg_1,kg_2,sum_kg);
		floor_1=sc.nextInt();
		Elevator elev_2=new Elevator();
		elev_2.Elevator(kg_1,kg_2,sum_kg);
		floor_2=sc.nextInt();

	}

}
