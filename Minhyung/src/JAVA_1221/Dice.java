package JAVA_1221;

public class Dice {
 static int dice;


 public int dice1(int no) {
     dice=(int)(Math.random()*no)+1;
     return dice;
      	 
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
