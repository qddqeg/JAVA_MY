package JAVA_1216;
import java.util.Scanner;
public class 매소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str=Scan();
     int leng=length(str);
     String sub=substring(str,leng);
     
    	 
     
    	 
     
	}
  public static String Scan() {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("문자를 입력하세요");
	  String str= sc.nextLine();
	   
	  return str;
  }
  public static int length(String str) {
	  int leng=str.length();
	  if(leng%2==0) {
		  int dice_1=dic_1(leng);
		  System.out.println("leng길이가 짝수이기떄문에 6면체 주사위가 굴러갑니다."+dice_1);
	  }else {
		  int dice_2=dic_2(leng);
		  System.out.println("leng길이가 홀수이기떄문에 7면체 주사위가 굴러갑니다."+dice_2);
	  }
		  
	  return leng;
  }
  public static String substring(String str, int leng) {
	  String sub="";
	  for(int i=0; i<leng;i++) {
		  sub=str.substring(i,i+1);
		  System.out.println(sub);
	  }
	  return sub;
  }
  public static int dic_1(int leng) {
	  int dic=(int)(Math.random()*6)+1;
	 
	  return dic;
  }
  public static int dic_2(int leng) {
	  int dic=(int)(Math.random()*7)+1;
	  return dic;
  }
  
}