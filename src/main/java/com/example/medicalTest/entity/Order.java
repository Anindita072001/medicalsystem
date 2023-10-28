package com.example.medicalTest.entity;

import java.sql.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
@Table(name="orderdetails")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int order_id;
	
	@NotNull(message="enter the orderDate")
	private Date order_date;
	
	@NotNull(message="enter the orderStatus")
	private String order_status;
	
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="patient_id",referencedColumnName = "patient_id")
	private Patient pa ;


//	public int getOrder_id() {
//		return order_id;
//	}
//
//
//	public void setOrder_id(int order_id) {
//		this.order_id = order_id;
//	}
//
//
//	public Date getOrder_date() {
//		return order_date;
//	}
//
//
//	public void setOrder_date(Date order_date) {
//		this.order_date = order_date;
//	}
//
//
//	public String getOrder_status() {
//		return order_status;
//	}
//
//
//	public void setOrder_status(String order_status) {
//		this.order_status = order_status;
//	}
//
//
//	public Patient getPa() {
//		return pa;
//	}
//
//
//	public void setPa(Patient pa) {
//		this.pa = pa;
//	}


	
	
	
	
}
