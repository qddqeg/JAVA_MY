package JAVA_1221;

public class Dice_main {

	public static void main(String[] args) {
		
	
		Dice dic= new Dice();
		int dice_1=dic.dice1(5);
	
		switch(dice_1) {
		case 1: 
			dic.one();
		break;
		
		case 2: 
			dic.two();
		break;
		
		case 3: 
			dic.three();
		break;
		
		case 4: 
			dic.four();
		break;
		
		case 5: 
			dic.five();
		break;
			
		}
	}

}
