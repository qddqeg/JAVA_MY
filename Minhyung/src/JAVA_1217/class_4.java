package JAVA_1217;

public class class_4 {
	static int money = 20000;

	public static void main(String[] args) {

		Buggerking bug = new Buggerking();
		money = bug.order(money);
		System.out.println("������ �����ϰڽ��ϴ�. ���� �ܰ�� : " + money + " �� �Դϴ�.");
		money = bug.order2(money);
		System.out.println("������ �����ϰڽ��ϴ�. ���� �ܰ�� : " + money + " �� �Դϴ�.");
	}

}
