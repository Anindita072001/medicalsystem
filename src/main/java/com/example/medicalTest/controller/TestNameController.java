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

import com.example.medicalTest.entity.TestName;
import com.example.medicalTest.service.TestNameService;

import jakarta.validation.Valid;

@RestController
public class TestNameController {
	@Autowired
TestNameService ts;
	
	@PostMapping("/addTestname")
	public ResponseEntity<TestName> addTestName(@RequestBody @Valid TestName testname) {
		
		return new ResponseEntity<> (ts.addTestName(testname),HttpStatus.CREATED);
	}


	 @GetMapping("/getTestname")
	    public List<TestName> getAllTestName() {
		 	return ts.fetchAllTestName();
	       
	    }
	  
	  @GetMapping("/getTestname/{id}") //localhost:8080/getPatient/5
	  public TestName getTestNameById(@PathVariable("id")int id)
	  {
		  return ts.getTestNameById(id);
		  
	  }
	  
	  @PutMapping("/Testname/{id}")
	    public TestName updateTestName(@PathVariable("id") int id, @RequestBody TestName testname) {
		  return ts.upadteTestNameById(id, testname);
	        
	    }
	  
	  @DeleteMapping("/Testname/{id}")
	  public String deleteTestName(@PathVariable("id") int id) {
		  return ts.deleteTestNameById(id);
		  
	  }
}
