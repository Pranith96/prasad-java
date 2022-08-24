package com.student.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Table(name = "student_table")
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@ApiModel(description = "Details About the Student Entity")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	@ApiModelProperty(notes = "The Unique Student Id")
	private Integer studentId;
	@ApiModelProperty(notes = "The Student name as String")
	@Column(name = "student_name")
	private String name;
	@ApiModelProperty(notes = "The Student mobile Number as String")
	@Column(name = "mobile_number")
	private String mobileNumber;
	@Column(name = "email")
	private String email;
	@ApiModelProperty(notes = "The Student login id as unique String")
	@Column(name = "login_id", unique = true)
	private String loginId;
	@Column(name = "password")
	private String password;

	@OneToOne(cascade = CascadeType.ALL) // ,fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = College.class)
	@JoinColumn(name = "college_id")
	private College college;

	@ManyToMany(cascade = CascadeType.ALL, targetEntity = Course.class)
	@JoinTable(name = "student_course", joinColumns = { @JoinColumn(name = "student_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "course_id") })
	private List<Course> courses;

	@Enumerated(EnumType.STRING)
	private Status status;

}
