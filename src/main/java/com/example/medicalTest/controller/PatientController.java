package com.example.medicalTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalTest.entity.Patient;
import com.example.medicalTest.service.PatientService;

import jakarta.validation.Valid;

@RestController
public class PatientController {
	@Autowired
	PatientService ts;
	
	@PostMapping("/addPatient")
	public ResponseEntity<Patient> addPatient(@RequestBody @Valid Patient test) {
		
		return new ResponseEntity<>(ts.addPatient(test),HttpStatus.CREATED);
	}
	
	
	 @GetMapping("/getPatient")
	    public List<Patient> getAllPatient() {
		 	return ts.fetchAllTest();
	       
	    }
	  
	  @GetMapping("/getPatient/{id}") //localhost:8080/getPatient/5
	  public Patient getPatientById(@PathVariable("id")int id)
	  {
		  return ts.getPatientById(id);
		  
	  }
	  
	  @PutMapping("/patient/{id}")
	    public Patient updatePatient(@PathVariable("id") int id, @RequestBody Patient test) {
		  return ts.upadtePatientById(id, test);
	        
	    }
	  
	  @DeleteMapping("/patient/{id}")
	  public String deletePatient(@PathVariable("id") int id) {
		  return ts.deletePatientById(id);
		  
	  }
}
