package com.mostafa.sna.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mostafa.sna.mvc.validation.CourseCode;

public class Customer {
	
	private String fname;
	
	@NotNull(message = "Last Name is Required")
	@Size(min = 1, max = 50, message = "Last Name is Required")
	private String lname;
	
	@NotNull(message = "Age is Required")
	@Min(value = 14, message = "Age Should Greater than 14")
	@Max(value = 65, message = "Age Should Less than 65")
	private Integer age;
	
//	@Pattern(regexp = "^[a-zA-Z0-9] {11}",
//			message = "Mobile Number Should be 11 digits or characters")
	@NotNull(message = "Mobile Number Should be 11 digits")
	@Pattern(regexp="[\\d]{11}",message = "Mobile Number Should be 11 digits")
	private String mobileNumber;
	
//	@CourseCode
	@NotNull(message="Course Code is Required")
	@CourseCode(value = {"Ruby", "Ruma"}, message = "Course Code should start with LUV or SNA")
	private String courseCode;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
