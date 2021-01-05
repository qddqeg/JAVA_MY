package JAVA_1216;

import java.sql.Date;

public class Smartphone {

	String model = "아이폰 8+";
	String color = "화이트";
	String company = "애플";

	public static void turnOn(String on) {
		if (on.equals("on")) {
			Date d = time();
			System.out.println("현재시간은" + d + " 입니다.");
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
		String news = "코로나19 3단계 격상";
		return news;
	}

}
