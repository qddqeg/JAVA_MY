package JAVA_1204;

public class part_4_indexOf_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yang!%?Jung";

		boolean con = str.contains("yang");
		System.out.println("Yang ���� �ִ°�?" + con);

		System.out.println(str.indexOf("��"));               // �ε��� ��ȣ�� ������ -1�� ������. -1�� ��ã�ڴٴ� ��

		int idx = str.indexOf("��");                      // �������� �ε��� ���� String idx=str.indexOf("��") X �����ʴ´�

		if (str.indexOf("!") != -1 || str.indexOf("%") != -1 || str.indexOf("?") != -1) {
			System.out.println("�ٽ� �Է����ּ���.");
		}

//   if(str.contains("Yang")) {
//	   System.out.println("contain ��ҹ��� ����");
//   }
//   
//   if(str.contains("yang")){
//   System.out.println("contain ��ҹ��� �����������߽��ϴ�.");
//   }
//   int i = str.index("!");
//   System.out.println("indexo �� ���ؽ� ��:"+i);

	}

}
