package com.cg.oneToone;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
public class Dl {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dlNo;
	private LocalDate expDate;
	private LocalDate issuDate;
	private String type;
	
	public Dl() {
		
	}
	
	public Dl(LocalDate expDate, LocalDate issuDate, String type) {
		super();
		this.expDate = expDate;
		this.issuDate = issuDate;
		this.type = type;
	}
	
	public int getDlNo() {
		return dlNo;
	}
	public void setDlNo(int dlNo) {
		this.dlNo = dlNo;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public LocalDate getIssuDate() {
		return issuDate;
	}
	public void setIssuDate(LocalDate issuDate) {
		this.issuDate = issuDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dl [dlNo=" + dlNo + ", expDate=" + expDate + ", issuDate=" + issuDate + ", type=" + type + "]";
	}
	
	

}
