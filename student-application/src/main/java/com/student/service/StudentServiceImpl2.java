package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dto.AddressDto;
import com.student.dto.StudentDto;
import com.student.dto.StudentResponseDto;
import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Service(value="service2")
@Transactional
public class StudentServiceImpl2 implements StudentService {

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
			throw new StudentNotFoundException("Student data is Empty");
		}
		return list;
	}

	@Override
	public StudentResponseDto getDetailsById(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data not found");
		}

		StudentResponseDto dto = new StudentResponseDto();
		StudentDto studentDto = new StudentDto();
		studentDto.setEmail(response.get().getEmail());
		studentDto.setLoginId(response.get().getLoginId());
		studentDto.setMobileNumber(response.get().getMobileNumber());
		studentDto.setName(response.get().getMobileNumber());

		AddressDto addressDto = new AddressDto();
		addressDto.setCity(response.get().getAddress().getCity());
		addressDto.setLocality(response.get().getAddress().getLocality());
		addressDto.setPlotNo(response.get().getAddress().getPlotNo());
		addressDto.setState(response.get().getAddress().getState());
		
		dto.setAddress(addressDto);
		dto.setStudent(studentDto);
		return dto;
	}

	@Override
	public List<Student> getDetailsByName(String name) {
		//List<Student> response = studentRepository.findByName(name);
		List<Student> response = studentRepository.getByName(name);
		if (response.isEmpty() || response == null) {
			throw new StudentNotFoundException("Student data is Empty");
		}
		return response;
	}

	@Override
	public Student getStudentLogin(String loginId, String password) {
		//Optional<Student> response = studentRepository.findByLoginIdAndPassword(loginId, password);
		Optional<Student> response = studentRepository.getByLoginIdAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data not found");
		}
		return response.get();
	}

	@Transactional
	@Override
	public String updateStudentName(String name, Integer studentId) {
		studentRepository.updateName(name,studentId);
		return "Details updated successfully";
	}

	@Override
	public String deleteStudent(Integer studentId) {
		//Student response = getDetailsById(studentId);
		//studentRepository.delete(response);
		studentRepository.deleteById(studentId);
		return "Deleted successdully";
	}
}
