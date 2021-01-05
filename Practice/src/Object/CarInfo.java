package Object;
public class CarInfo {

public static void main(String[] args) {

//객체 생성

	Car myCar = new Car();

//필드 값 읽기	
	System.out.println("제작회사: " + myCar.company[4]); // myCar(이름).company(할 수 있는 일)
	System.out.println("모델명: " + myCar.model[4]);
	System.out.println("색깔: " + myCar.color[4]);
	System.out.println("최고속도: " + myCar.ps[4]);
	System.out.println("현재속도: " + myCar.speed);


//필드 값 변경

	myCar.speed = 60;
	System.out.println("수정된 속도: " + myCar.speed);

}

}
