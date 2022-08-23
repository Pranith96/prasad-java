package com.student.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer collegeId;
	private String collegeName;
	private String collegeCode;

	@JsonIgnore
	@OneToMany(mappedBy = "college")
	private List<Student> student;

}
