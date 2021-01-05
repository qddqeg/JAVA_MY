package JAVA_1221;

public class Elevator {
	static final int min_floor = 1;
	static final int max_floor = 10;
	static final int max_kg = 100;

	public void Elevator(int kg_1,int kg_2,int sum_kg) {
		if (kg_1 <= max_kg&&kg_2<=max_kg&&sum_kg<=max_kg) {
			System.out.println("엘레베이터 이용이 가능합니다.");
			System.out.println("=======================");
			System.out.println("가실 층을 눌러주세요.");
		}else {
			System.out.println("중량 초과 입니다. 내려주세요");
		}
		

	}

}
