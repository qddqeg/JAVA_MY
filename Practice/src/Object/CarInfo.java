package Object;
public class CarInfo {

public static void main(String[] args) {

//��ü ����

	Car myCar = new Car();

//�ʵ� �� �б�	
	System.out.println("����ȸ��: " + myCar.company[4]); // myCar(�̸�).company(�� �� �ִ� ��)
	System.out.println("�𵨸�: " + myCar.model[4]);
	System.out.println("����: " + myCar.color[4]);
	System.out.println("�ְ�ӵ�: " + myCar.ps[4]);
	System.out.println("����ӵ�: " + myCar.speed);


//�ʵ� �� ����

	myCar.speed = 60;
	System.out.println("������ �ӵ�: " + myCar.speed);

}

}
