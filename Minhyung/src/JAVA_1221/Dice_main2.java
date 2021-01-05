package JAVA_1221;

public class Dice_main2 {

	public static void main(String[] args) {
		
      Dice2 dic= new Dice2();
      
      dic.setDice(5);
      
  	switch(dic.getDice()) {
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
