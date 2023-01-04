package basic_package;

class College {
	private int cId;
	private String cName;

	public College() {
		super();
	}

	public College(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	@Override
	public String toString() {
		return "College [College ID : " + cId + ", College Name : " + cName + "]";
	}

}

public class BeansDemo {

	public static void main(String[] args) {
		College s1 = new College();
		s1.setcId(101);
		s1.setcName("MAKAUT");
		System.out.println(s1);

		System.out.println("College ID : " + s1.getcId());
		System.out.println("College Name : " + s1.getcName());
	}

}
