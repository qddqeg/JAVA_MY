package JAVA_1217;

public class class_2 {
static int Bus_card= 5000;
 
	public static void main(String[] args) {
		
		Bus bus= new Bus();
		Bus_card=Bus.reader(Bus_card);
		Elevaitor ev = new Elevaitor(5)	;
		ev.up(6);

	}

}
