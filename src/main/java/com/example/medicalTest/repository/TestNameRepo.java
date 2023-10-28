package com.example.medicalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalTest.entity.TestName;
@Repository
public interface TestNameRepo extends JpaRepository<TestName, Integer>{

}
