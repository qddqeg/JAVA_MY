package JAVA_1221;

public class car {
 
	protected String color;
	int speed;
	
}

class Sedan extends car{
	void setSpeed(int speed) {
		this.speed= speed;
	}
	void setcolor(String color) {
		this.color =color;
	}
}

