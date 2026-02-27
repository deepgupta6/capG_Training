package streamAssignment;

public class DurationEmp {
	private String eFirstName;
	String eLastName;
	int months;
	int days;
	
	
	
	public DurationEmp() {
		super();
	}

	public DurationEmp(String eFirstName, String eLastName, int months, int days) {
		super();
		this.eFirstName = eFirstName;
		this.eLastName = eLastName;
		this.months = months;
		this.days = days;
	}
	
	public String geteFirstName() {
		return eFirstName;
	}
	public void seteFirstName(String eFirstName) {
		this.eFirstName = eFirstName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String geteLastName() {
		return eLastName;
	}
	public void seteLastName(String eLastName) {
		this.eLastName = eLastName;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	
	public String toString() {
		return eFirstName + " " + eLastName + " " + months + " " + days;
	}
	
	
	

}
