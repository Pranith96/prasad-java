package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String saveStudent(Student student) {
		Student response = studentRepository.save(student);
		if (response == null) {
			return "data not saved";
		}
		return "data saved succesffully";
	}

	@Override
	public List<Student> getAllDetails() {
		List<Student> list = studentRepository.findAll();
		if (list.isEmpty() || list == null) {
			throw new RuntimeException("Student data is Empty");
		}
		return list;
	}

	@Override
	public Student getDetailsById(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data not found");
		}
		return response.get();
	}

	@Override
	public List<Student> getDetailsByName(String name) {
		List<Student> response = studentRepository.findByName(name);
		if (response.isEmpty() || response == null) {
			throw new RuntimeException("Student data is Empty");
		}
		return response;
	}

	@Override
	public Student getStudentLogin(String loginId, String password) {
		Optional<Student> response = studentRepository.findByLoginIdAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new RuntimeException("Data not found");
		}
		return response.get();
	}
}
