package com.mostafa.sna.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

//	need a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
//	need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
//	second controller method to process the html form
	@RequestMapping("/processFormTwo")
	public String processFormHttpServletRequst(HttpServletRequest request, Model model) {
//		read the request parameter from the view form
		String name = request.getParameter("studentName");
		
		String result = name.toUpperCase();
		
		result = "This is "+result;
		
//		add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
//	third controller method to process the html form
	@RequestMapping("/processFormThree")
	public String processFormRequestParam(@RequestParam("studentName") String name, Model model) {
		
		String result = name.toLowerCase();
		
		result = "This is "+result;
		
//		add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
