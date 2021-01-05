package JAVA_1204;

public class part_4_indexOf_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yang!%?Jung";

		boolean con = str.contains("yang");
		System.out.println("Yang 값이 있는가?" + con);

		System.out.println(str.indexOf("가"));               // 인덱스 번호가 없으면 -1이 찍힌다. -1는 못찾겠다는 뜻

		int idx = str.indexOf("가");                      // 정수형은 인덱스 가능 String idx=str.indexOf("가") X 되지않는다

		if (str.indexOf("!") != -1 || str.indexOf("%") != -1 || str.indexOf("?") != -1) {
			System.out.println("다시 입력해주세요.");
		}

//   if(str.contains("Yang")) {
//	   System.out.println("contain 대소문자 구분");
//   }
//   
//   if(str.contains("yang")){
//   System.out.println("contain 대소문자 구분하지못했습니다.");
//   }
//   int i = str.index("!");
//   System.out.println("indexo 의 인텍스 값:"+i);

	}

}
