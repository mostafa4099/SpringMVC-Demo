package com.mostafa.sna.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
//		create a student object
		Student student = new Student();
		
		student.setFirstName("Mostafa");
		
//		add student object to the model
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("The Student is "+student.getFirstName()+" "+student.getLastName());
		
		return "student-confirmation";
	}
}
