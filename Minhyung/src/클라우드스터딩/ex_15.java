package 클라우드스터딩;

public class ex_15 {
public static void printPay(double basePay, int hours) {
	double hoursPay_2=0;
	double hoursPay=0;
	if(basePay<8.0) {
		System.out.println("ERROR : 최저시급 불이행");
	}else if(hours>40&&hours<=60) {
		hoursPay_2=(hours-40)*basePay*1.5;
		System.out.println("$"+hoursPay+hoursPay_2);
	}else if(hours>60) {
		System.out.println("ERROR : 제한 근무시간 초과.");
	}else {
		 hoursPay=hours*basePay;
		System.out.println("$"+hoursPay+hoursPay_2);
	}
}
	public static void main(String[] args) {
		printPay(7.50,35);
		printPay(8.20,47);
		printPay(10.00,73);

	}

}
