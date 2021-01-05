
public class Keycode_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode = 0;
		System.out.println("문자를 입력하세요");
		keyCode = System.in.read();
		System.out.println("키코드는"+keyCode);
		
		if(keyCode%2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
	}

}
