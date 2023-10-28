package com.example.medicalTest.service;

import java.util.List;

import com.example.medicalTest.entity.TestName;

public interface TestNameService {
	TestName addTestName(TestName testname); // Insert
	List<TestName> fetchAllTestName(); // select
	TestName getTestNameById(int id); // select by id
	TestName upadteTestNameById(int id, TestName testname); // Update
	String deleteTestNameById(int id);
}
