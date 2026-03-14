package lab1.ps3.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {
	@Value("${sbuCode}")
	private String sbuCode;
	@Value("${sbuName}")
	private String sbuName;
	@Value("${sbuHead}")
	private String sbuHead;
	private List<Employee> empList;
	
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	public void printSbuDetails() {
		System.out.println("SBU Details");
		System.out.println("-----------------------------");
		System.out.println("sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead );
		System.out.println("Employee Details:-------------------");
		empList.forEach(e->System.out.println(e));
	}
	

}
