package com.infosys.project.order.entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int orderid;
	@Column(nullable = false)
	int buyerid;
	@Column(nullable = false)
	double amount;
	@Column(nullable = false)
	LocalDate date;
	@Column(nullable = false)
	String address;
	@Column(nullable = false)
	String status;
	public OrderDetails() {
		super();
	}
	public OrderDetails(int i, int j, double d, LocalDate localDate, String string, String string2) {
		super();
	}
	
//
//public void OrderDetails(int orderid,int buyerid,double amount,LocalDate date,String address,String status) {
//	this.orderid=orderid;
//	this.buyerid=buyerid;
//	this.amount=amount;
//	this.date=date;
//	this.address=address;
//	this.status=status;
//}
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
