package ����;

public class Phone_book {
 String list[]= {"ȫ�浿","�̼���","�庸��"};
	

public void List() {
	for(int i=0; i<list.length;i++) {
		list[i].substring(i,i+1);
	}
	for(String k:list) {
		System.out.println(k);
	}
}



}