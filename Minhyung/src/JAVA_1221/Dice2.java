package JAVA_1221;

public class Dice2 {
   private int dice;

   

public int getDice() {
	
	return dice;
}

public void setDice(int no) {
	dice=(int)(Math.random()*no)+1;
	this.dice = dice;
}

public void one() {
	 System.out.println("�ֻ����� 1�� ���Խ��ϴ�.");
}
public void two() {
	 System.out.println("�ֻ����� 2�� ���Խ��ϴ�.");
}
public void three() {
	 System.out.println("�ֻ����� 3�� ���Խ��ϴ�.");
}
public void four() {
	 System.out.println("�ֻ����� 4�� ���Խ��ϴ�.");
}
public void five() {
	 System.out.println("�ֻ����� 5�� ���Խ��ϴ�.");
}
   
  
}
