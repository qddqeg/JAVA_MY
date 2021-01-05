package JAVA_1229;

public class Exam {

	private int kor;
	private int eng;
	private int math;
    private int Social;
    private int Science;

	public int getSocial() {
		return Social;
	}

	public void setSocial(int social) {
		Social = social/2;
		
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}
