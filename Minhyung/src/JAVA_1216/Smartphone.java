package JAVA_1216;

import java.sql.Date;

public class Smartphone {

	String model = "������ 8+";
	String color = "ȭ��Ʈ";
	String company = "����";

	public static void turnOn(String on) {
		if (on.equals("on")) {
			Date d = time();
			System.out.println("����ð���" + d + " �Դϴ�.");
		} else {
			System.out.println("");
		}
	}

	public static String drag(String on) {
		String news = chrome();
		return news;
	}

	public static Date time() {
		Date date_now = new Date(System.currentTimeMillis());
		return date_now;

	}

	public static String chrome() {
		String news = "�ڷγ�19 3�ܰ� �ݻ�";
		return news;
	}

}
