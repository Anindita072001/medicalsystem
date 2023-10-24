package com.example.medicalTest.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalTest.entity.Patient;
import com.example.medicalTest.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService  {
	
	@Autowired
	PatientRepository tp;
	
	
	@Override
	public Patient addPatient(Patient test) {
	
		return tp.save(test);
	}

	@Override
	public List<Patient> fetchAllTest() {
		List<Patient> allPatient = tp.findAll();
		return allPatient;
	}

	@Override
	public Patient getPatientById(int id) {
		Optional<Patient> test = tp.findById(id);

		if (test.isPresent()) {

			return test.get();
		}

		return null;
		
	}

	@Override
	public Patient upadtePatientById(int id, Patient test) {
		Optional<Patient> test1 = tp.findById(id);
		
		if (test1.isPresent()) {
			
			Patient originalPatient = test1.get();
			
			 if (Objects.nonNull(test.getPatient_name()) && !"".equalsIgnoreCase(test.getPatient_name())) {
				 originalPatient.setPatient_name(test.getPatient_name());
	            }
			 if (Objects.nonNull(test.getGender()) && !"".equalsIgnoreCase(test.getGender())) {
				 originalPatient.setGender(test.getGender());
	            }
			 
			 if (Objects.nonNull(test.getAge()) && !(0==test.getAge())) {
				 originalPatient.setAge(test.getAge());
	            }
			 
			 if (Objects.nonNull(test.getPhone_no()) && !(0==test.getPhone_no())) {
				 originalPatient.setPhone_no(test.getPhone_no());
	            }
			 
			 if (Objects.nonNull(test.getEmail_id()) && !"".equalsIgnoreCase(test.getEmail_id())) {
				 originalPatient.setEmail_id(test.getEmail_id());
	            }
			 if (Objects.nonNull(test.getaddress()) && !"".equalsIgnoreCase(test.getaddress())) {
				 originalPatient.setaddress(test.getaddress());
	            }
			 
			return tp.save(originalPatient);
	            
			
		}
		return null;
	}

	@Override
	public String deletePatientById(int id) {
		if(tp.findById(id).isPresent()) {
			tp.deleteById(id);
			
			return "user deleted successfully";
		}
		return "No such user in the database";
	}

}
