package JAVA_1216;
import java.util.Scanner;
public class �żҵ�_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str=Scan();
     int leng=length(str);
     String sub=substring(str,leng);
     
    	 
     
    	 
     
	}
  public static String Scan() {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("���ڸ� �Է��ϼ���");
	  String str= sc.nextLine();
	   
	  return str;
  }
  public static int length(String str) {
	  int leng=str.length();
	  if(leng%2==0) {
		  int dice_1=dic_1(leng);
		  System.out.println("leng���̰� ¦���̱⋚���� 6��ü �ֻ����� �������ϴ�."+dice_1);
	  }else {
		  int dice_2=dic_2(leng);
		  System.out.println("leng���̰� Ȧ���̱⋚���� 7��ü �ֻ����� �������ϴ�."+dice_2);
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