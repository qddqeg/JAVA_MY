package JAVA_1203;
import java.util.Scanner;
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int ����_hp = 100;
        System.out.println("������ HP��"+ ����_hp+"�Դϴ�.");
        
        
        System.out.println("���⸦ �������ּ���.");//���⼱��
        System.out.println("1.��  2.����  3.Ȱ");
        String �����̸� = "";
        int ���� = sc.nextInt();
        int ���ݷ� =0;
        
        switch(����) {
        
        case 1 : 
        	�����̸�="��";
        	���ݷ� = 10;
        	break;
        	
        	
        case 2 :
        	�����̸� ="����";
        	���ݷ� = 13;
        	break;
        	
        	
        case 3 : 
        	�����̸� ="Ȱ";
        	���ݷ� = 8;
        	break;
        	
        default :
        	�����̸� ="�ָ�";
        	���ݷ� = 1;
        	
        	
        }
        System.out.println(�����̸�);
        System.out.println(���ݷ�);
        	
        
        
        
	}

}
