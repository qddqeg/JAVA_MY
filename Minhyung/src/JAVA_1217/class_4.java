package JAVA_1217;

public class class_4 {
	static int money = 20000;

	public static void main(String[] args) {

		Buggerking bug = new Buggerking();
		money = bug.order(money);
		System.out.println("결제를 진행하겠습니다. 남은 잔고는 : " + money + " 원 입니다.");
		money = bug.order2(money);
		System.out.println("결제를 진행하겠습니다. 남은 잔고는 : " + money + " 원 입니다.");
	}

}
