package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentResponseDto;
import com.student.entity.Student;
import com.student.service.StudentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Qualifier(value = "service1")
	@Autowired
	StudentService studentService;

	@ApiOperation(value = "Student account Creation API", notes = "Please provide all the info for Student account creation", response = Student.class)
	@PostMapping("/save")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String response = studentService.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get-all")
	@ApiOperation(value = "Student Details Fetcn API", notes = "Please provide all the info for Fetching student records", response = Student.class)
	public ResponseEntity<List<Student>> getAllStudentRecords() {
		List<Student> response = studentService.getAllDetails();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	@ApiOperation(value = "Student Details Fetcn API By Id", notes = "Please provide Id Fetching student record", response = Student.class)
	public ResponseEntity<StudentResponseDto> getStudentRecordsById(@PathVariable("studentId") Integer studentId) {
		StudentResponseDto response = studentService.getDetailsById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/id")
	public ResponseEntity<StudentResponseDto> getStudentRecord(@RequestParam("studentId") Integer studentId) {
		StudentResponseDto response = studentService.getDetailsById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/name/{name}")
	public ResponseEntity<List<Student>> getStudentRecordsByName(@PathVariable("name") String name) {
		List<Student> response = studentService.getDetailsByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/login/{loginId}/{password}")
	public ResponseEntity<Student> getStudentLogin(@PathVariable("loginId") String loginId,
			@PathVariable("password") String password) {
		Student response = studentService.getStudentLogin(loginId, password);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update/{name}/{studentId}")
	public ResponseEntity<String> updateStudentName(@PathVariable("name") String name,
			@PathVariable("studentId") Integer studentId) {
		String response = studentService.updateStudentName(name, studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
