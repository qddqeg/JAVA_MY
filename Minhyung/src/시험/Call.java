package ����;

import com.sun.source.tree.SwitchTree;

public class Call {

	public void Pick() {
		SmartPhone sp = new SmartPhone();
		Phone_book pb = new Phone_book();
		pb.List();
		System.out.println("��ȭ�� ����� �Է��ϼ���.");
		System.out.println("|1.ȫ�浿|2.�̼���|3.�庸��|");
		String call_name[] = pb.list;
		switch (sp.SCANNER()) {
		case 1:

			System.out.println(call_name[0] + " ���� ��ȭ�� �̴ϴ�.");
			System.out.println("������~~~������~~~~");
			break;
		case 2:

			System.out.println(call_name[1] + " ���� ��ȭ�� �̴ϴ�.");
			System.out.println("������~~~������~~~~");
			break;
		case 3:

			System.out.println(call_name[2] + " ���� ��ȭ�� �̴ϴ�.");
			System.out.println("������~~~������~~~~");
			break;
		}
	}
}
