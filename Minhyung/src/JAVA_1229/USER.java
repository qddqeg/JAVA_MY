package JAVA_1229;

public class USER {
	private String ID;
	private String name;
	private int PASS;
    	
    
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		if(iD.length()>6) {
			
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 6���� �̳��� �Է����ּ���.");
		}else {
			ID = iD;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>4) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 4���� �̳��� �Է����ּ���.");
		}else {
			this.name = name;
		}
		
	}

	public int getPASS() {
		return PASS;
	}

	public void setPASS(int pASS) {
		if(pASS>99999999) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 8���� �̳��� �Է����ּ���.");
		}else {
			PASS = pASS;
		}
		
	}
}