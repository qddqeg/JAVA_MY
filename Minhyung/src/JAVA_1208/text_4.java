package JAVA_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class text_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// ���� ��ü ����
		File file = new File("C:\\txt\\txt_1.txt");
		File file_1 = new File("C:\\txt\\txt.txt");

		try (FileWriter fw = new FileWriter(file)) {
			Scanner sc = new Scanner(file_1);
			System.out.println("!11111111");
			String str = "";
			System.out.println("22222222");
			String array[] = null;
			System.out.println("33333333");
			System.out.println(sc.hasNextLine());
			while (sc.hasNextLine()) {                          //����� �ִ°�
				System.out.println("4444444");
				str = sc.nextLine();
				System.out.println(str);
		        array = str.split("-|@");
				System.out.println(str);
			}
			
			PrintWriter pw = new PrintWriter(fw);            // �����ִ°�
			
			for(int i = 0; i < array.length; i++) {
				pw.print(array[i]);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
}
