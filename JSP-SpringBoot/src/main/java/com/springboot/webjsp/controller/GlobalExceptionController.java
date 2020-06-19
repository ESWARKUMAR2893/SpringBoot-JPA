package com.springboot.webjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptionController {

	
	@ExceptionHandler(value=ArithmeticException.class)
	public String showErrorPage(Model model) {
		model.addAttribute("error", "ArithmeticException Exception caught in Global exception handler ");
		
		return "showerror";
	}
	
}
