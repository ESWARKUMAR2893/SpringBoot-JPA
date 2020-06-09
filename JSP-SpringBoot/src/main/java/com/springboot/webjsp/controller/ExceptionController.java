package com.springboot.webjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

	
	
	@GetMapping("showsuccess-page")
	public String showSuccessPage(Model model) {
		model.addAttribute("success","yes there is no exception");
		String str=null;
		str.length(); //this cause null point excpetion and needs to handle by showErrorPage method 
		return "showsuccess";
	}
	
	// this is controller level exception handling 
	@ExceptionHandler(value=NullPointerException.class)
	public String showErrorPage(Model model) {
		model.addAttribute("error", "Exception happend due to null point ");
		
		return "showerror";
	}
}
