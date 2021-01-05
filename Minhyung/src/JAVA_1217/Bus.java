package JAVA_1217;

public class Bus {
static int discount= 1200;
 public Bus() {
	 
 }
 public static int reader(int Bus_card) {
	 Bus_card= Bus_card -discount;
	 System.out.println("잔액은"+Bus_card+" 원 입니다.");
	 return Bus_card;
	
	 
 }
 
}
