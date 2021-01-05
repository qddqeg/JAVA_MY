package IndexOf;

public class IndexOf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k = "010-1234-5678";
		int i =k.indexOf("-"); //2
		String l = k.substring(i+1,k.length()); //1234-5678
		int j = l.indexOf("-"); // 5

		
		System.out.println(k.substring(0,i));
		System.out.println(l.substring(0,j));
		System.out.println(l.substring(j+1,l.length()));
	}

}
