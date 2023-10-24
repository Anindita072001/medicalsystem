package com.example.medicalTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="TestName")
@Entity
public class TestName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int test_id;
	private String test_name;
	private int test_amount;
	
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public String getTest_name() {
		return test_name;
	}
	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}
	public int getTest_amount() {
		return test_amount;
	}
	public void setTest_amount(int test_amount) {
		this.test_amount = test_amount;
	}
	
	
	
	
}	
