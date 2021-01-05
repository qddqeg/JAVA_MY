package JAVA_1215;

public class 시험 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-1
		//1
       int x=19;
       boolean bo=true;
       if(x>10&&x<20) {
    	//   System.out.println(bo);
       }
       //2
       char ch='A';
      if(ch!=' '||ch!='	') {
    	  bo=true;
    	 // System.out.println(bo);
      }
      //3
      char ch_1='x';
      if(ch_1=='x'||ch_1=='X') {
    	  bo=true;
    	//  System.out.println(bo);
      }
      //4
      char ch_2=3;
      if(ch_2>=0&&ch_2<=10) {
    	  bo=true;
    	//  System.out.println(bo);
      }
      //4-2
      //답은 73
      int sum=0;
      for(int i=1;i<=20;i++) {
    	if(i%2!=0&&i%3!=0) {
    		sum+=i;
    		
    //		System.out.println(sum);
    	}
      }
      //4-3
      //답은 220
    	int sum_1=0;
    	for(int j=1;j<=10;j++) {
    		for(int k= 1;k<=j;k++) {
    			sum_1+=k;
    			System.out.println(k);
    		}
    		
    	}System.out.println(sum_1);
    	 
    	
      
      
	}

}
