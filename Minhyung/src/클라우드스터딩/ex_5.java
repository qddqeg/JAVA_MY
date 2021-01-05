package Å¬¶ó¿ìµå½ºÅÍµù;

public class ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String don="µ·±î½º";
		String cal="Ä®±¹¼ö";
		String man="¿Õ¸¸µÎ";
		
         int don_m=8000;
         int cal_m=6000;
         int man_m=5000;
         
         int don_num=16;
         int cal_num=8;
         int man_num=1;
         
         int don_mult=don_m*don_num;
         int cal_mult=cal_m*cal_num;
         int man_mult=man_m*man_num;
         
         
         
         int sum=don_mult+cal_mult+man_mult;
         System.out.println(don+" x "+don_num+" = "+don_mult);
         System.out.println(cal+" x "+cal_num+" = "+cal_mult);
         System.out.println(man+" x "+man_num+" = "+man_mult);
         System.out.println("========================");
         System.out.println("ÃÑÇÕ : "+sum);
         
         
         
	}

}
