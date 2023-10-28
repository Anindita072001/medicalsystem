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
@Table(name="TestName")
public class TestName {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long test_id;
	
	@NotNull(message="enter the testName")
	private String test_name;
	
	@NotNull(message="enter price")
	private Long test_amount;
	

	
}	
