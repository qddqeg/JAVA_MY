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
		System.out.println("�¿����� ����� �¿�� �ֽ��ϴ�.");
	}
}

class Truck extends car_2{
	void work() {
		System.out.println("Ʈ���� ���� �ư� �ֽ��ϴ�.");
	}
}


