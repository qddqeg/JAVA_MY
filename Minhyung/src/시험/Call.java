package 시험;

import com.sun.source.tree.SwitchTree;

public class Call {

	public void Pick() {
		SmartPhone sp = new SmartPhone();
		Phone_book pb = new Phone_book();
		pb.List();
		System.out.println("전화걸 대상을 입력하세요.");
		System.out.println("|1.홍길동|2.이순신|3.장보고|");
		String call_name[] = pb.list;
		switch (sp.SCANNER()) {
		case 1:

			System.out.println(call_name[0] + " 에게 전화를 겁니다.");
			System.out.println("따르릉~~~따르릉~~~~");
			break;
		case 2:

			System.out.println(call_name[1] + " 에게 전화를 겁니다.");
			System.out.println("따르릉~~~따르릉~~~~");
			break;
		case 3:

			System.out.println(call_name[2] + " 에게 전화를 겁니다.");
			System.out.println("따르릉~~~따르릉~~~~");
			break;
		}
	}
}
