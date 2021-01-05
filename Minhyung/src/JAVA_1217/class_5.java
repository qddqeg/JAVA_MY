package JAVA_1217;

public class class_5 {
	static int read_page = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();

		Read(read_page);

	}

	public static int Read(int read_page) {
		Book book = new Book();
		boolean bo = true;
		while (bo) {
			read_page += 1;

			System.out.println(read_page + " 페이지");

			for (int i = 0; i < book.note.length(); i++) {
				String sub = book.note.substring(i, i + 1);
				System.out.println(sub);
			}

			if (read_page == 360) {
				bo = false;
				System.out.println("책 " + book.title + " 다읽었다!!");
			}

		}
		return read_page;
	}
 
}
