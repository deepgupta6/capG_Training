package stream;

public class Employee {
	private int eId;
	private String eName;
	private Double eSal;
	
	public Employee(int eId, String eName, Double eSal) {
		//super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Double getSal() {
		return eSal;
	}
	public void setSal(Double sal) {
		this.eSal = sal;
	}
	
	public String toString() {
		return eId + " "+ eName + " " + eSal;
	}
	
	

}
