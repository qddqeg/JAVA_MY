package Logical;

public class Logical_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode= 'A';
		System.out.println(charCode);
		
		if((charCode>=65)&&(charCode<=90)) {
			System.out.println("�빮��");
		}
		if((charCode>=97)&& (charCode<=122)) {
			System.out.println("�ҹ���");
		}
		if((charCode<48)&& !(charCode>57)) {
			System.out.println("����");
		}
	}

}
