package Test;
import java.util.Random;
public class Rabdom_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int i = rd.nextInt(100)+1;
		System.out.println(i);
		
		if(i%2 == 0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}

	}

}
