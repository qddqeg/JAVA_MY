package JAVA_1217;

public class Buggerking {
	static int bugger = 5000;
	static int bugger2 = 4000;

	public static int order(int money) {
		money = money - bugger;
		System.out.println("�ֹ��Ͻ� ���ſ� ������" + bugger + " �Դϴ�.");

		return money;
	}

	public static int order2(int money) {
		money = money - bugger2;
		System.out.println("�ֹ��Ͻ� ���ſ� ������" + bugger2 + " �Դϴ�.");

		return money;
	}
}
