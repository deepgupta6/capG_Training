package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity 
//@Table(name = "productData")
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	@Column(name = "productName", nullable = false,length = 50)
	private String pName;
	private double pPrice;
//	@Transient not create column in database
	private int pQty;
	private LocalDate pDom;
	
	public Product() {
		
	}
	
	public Product(int pId, String pName, double pPrice, int pQty, LocalDate pDom) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
		this.pDom = pDom;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public LocalDate getpDom() {
		return pDom;
	}
	public void setpDom(LocalDate pDom) {
		this.pDom = pDom;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pQty=" + pQty + ", pDom=" + pDom
				+ "]";
	}
	
	
	
	

}
