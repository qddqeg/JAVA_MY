package 시험;

public class Phone_book {
 String list[]= {"홍길동","이순신","장보고"};
	

public void List() {
	for(int i=0; i<list.length;i++) {
		list[i].substring(i,i+1);
	}
	for(String k:list) {
		System.out.println(k);
	}
}



}