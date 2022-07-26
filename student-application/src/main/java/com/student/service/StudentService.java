package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String saveStudent(Student student);

	List<Student> getAllDetails();

	Student getDetailsById(Integer studentId);

	List<Student> getDetailsByName(String name);

	Student getStudentLogin(String loginId, String password);

	String updateStudentName(String name, Integer studentId);

	String deleteStudent(Integer studentId);

}
