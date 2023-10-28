package com.example.medicalTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_id;
	@NotNull(message="enter the name")
	private String patient_name;
	@NotNull(message="enter the gender")
	private String gender;
	@NotNull(message="enter the age")
	private int age;
	@NotNull(message="enter the phoneNo")
	private Long phone_no;
	@NotNull(message="enter the emailId")
	private String email_id;
	@NotNull(message="enter the address")
	private String address;
	@NotNull(message="enter the password")
	private String password;
	
//	public int getPatient_id() {
//		return patient_id;
//	}
//	public void setPatient_id(int patient_id) {
//		this.patient_id = patient_id;
//	}
//	public String getPatient_name() {
//		return patient_name;
//	}
//	public void setPatient_name(String patient_name) {
//		this.patient_name = patient_name;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getPhone_no() {
//		return phone_no;
//	}
//	public void setPhone_no(int phone_no) {
//		this.phone_no = phone_no;
//	}
//	public String getEmail_id() {
//		return email_id;
//	}
//	public void setEmail_id(String email_id) {
//		this.email_id = email_id;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	

	
}
