package JAVA_1217;

public class Elevaitor {
	static int floor = 0;
	public Elevaitor (int floor) {
		this.floor = floor;
	}
	public static void up(int up) {
		floor=up;
		System.out.println(floor+"���� �����Ͽ����ϴ�.");
		
	}
     public static void down() {
		
	}
}
