class Students {
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setRollNo(10);
		s1.setName("Mahesh Chavare");
		
		System.out.println(s1.getName());
		//System.out.println(s1.getRollNo());
		
	}
}