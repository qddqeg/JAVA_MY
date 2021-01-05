package JAVA_1221;

public class Dice {
 static int dice;


 public int dice1(int no) {
     dice=(int)(Math.random()*no)+1;
     return dice;
      	 
 }
 public void one() {
	 System.out.println("주사위가 1이 나왔습니다.");
 }
 public void two() {
	 System.out.println("주사위가 2가 나왔습니다.");
 }
 public void three() {
	 System.out.println("주사위가 3이 나왔습니다.");
 }
 public void four() {
	 System.out.println("주사위가 4가 나왔습니다.");
 }
 public void five() {
	 System.out.println("주사위가 5가 나왔습니다.");
 }
}
