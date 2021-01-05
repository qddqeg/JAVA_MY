package 클라우드스터딩;
import java.util.Scanner;
public class ex_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("// 시급, 일한시간 순 입력");
		int timemoney=sc.nextInt();
		int workingtime=sc.nextInt();
		int pay=timemoney*workingtime;
		System.out.println("총급여 : "+pay+ " 입니다.");

	}

}
