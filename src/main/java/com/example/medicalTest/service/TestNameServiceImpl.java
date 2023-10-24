package com.example.medicalTest.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalTest.entity.TestName;
import com.example.medicalTest.repository.TestNameRepo;

@Service
public class TestNameServiceImpl implements TestNameService {
	@Autowired
	TestNameRepo tr;
	
	
	@Override
	public TestName addTestName(TestName testname) {
		return tr.save(testname);
	}

	@Override
	public List<TestName> fetchAllTestName() {
		List<TestName> allTestName = tr.findAll();
		return allTestName;
		
	}

	@Override
	public TestName getTestNameById(int id) {
		Optional<TestName> testname = tr.findById(id);

		if (testname.isPresent()) {

			return testname.get();
		}
		return null;
	}

	@Override
	public TestName upadteTestNameById(int id, TestName testname) {
		Optional<TestName> t1 = tr.findById(id);
		
		if (t1.isPresent()) {
			
			TestName originalTestName = t1.get();
			
			if (Objects.nonNull(testname.getTest_name()) && !"".equalsIgnoreCase(testname.getTest_name())) {
				 originalTestName.setTest_name(testname.getTest_name());;
	           }
			
			if (Objects.nonNull(testname.getTest_amount()) && !(0==testname.getTest_amount())) {
				 originalTestName.setTest_amount(testname.getTest_amount());
	           }
			
			 
		return tr.save(originalTestName);
	}
		return null;
	}

	@Override
	public String deleteTestNameById(int id) {
		if(tr.findById(id).isPresent()) {
			tr.deleteById(id);
			
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	}



