
public class Keycode_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode = 0;
		System.out.println("���ڸ� �Է��ϼ���");
		keyCode = System.in.read();
		System.out.println("Ű�ڵ��"+keyCode);
		
		if(keyCode%2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
	}

}
