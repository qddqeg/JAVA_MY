package JAVA_1221;

abstract class car_2 {
 int speed = 0;
 String color;
 
 void upSpeed(int speed) {
	 this.speed += speed;
 }
 
 abstract void work();
 
}

class Sedan1 extends car_2{
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Truck extends car_2{
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}


