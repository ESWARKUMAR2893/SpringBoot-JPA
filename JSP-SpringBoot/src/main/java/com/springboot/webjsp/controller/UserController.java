package com.springboot.webjsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.webjsp.entity.User;
import com.springboot.webjsp.service.UserService;

@Controller
public class UserController {

	private final UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}

	
	
	
	@GetMapping("/login")
	public ModelAndView showLoginPage() {
		
		 ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView showWelcomePage(@ModelAttribute User user,Model model) {
        
		 ModelAndView mv= new ModelAndView();
		 
		 System.out.println("USER: ============>>>>>>>>>"+user.toString());
		 if(this.service.loginUser(user)) {
			 mv.setViewName("welcome"); 
		 }else {
			 model.addAttribute("error","Invalid Credentials");
			 mv.setViewName("login");
		 }
			return mv;
		
		}
	
	
	
	@GetMapping("/register")
	public ModelAndView showRegisterPage() {
		
		 ModelAndView mv= new ModelAndView();
			mv.setViewName("registration");
			return mv;
	}
	
	@PostMapping("/register")
	public String saveUser(@ModelAttribute User user,Model model) {
				
		User checkemail = this.service.checkEmail(user.getEmail());	
		
		System.out.println("User "+user.toString());
		
		System.out.println("user.getLastname"+user.getLastname());
		System.out.println("user.getEmail"+user.getEmail());
		  if(checkemail == null) {
			  this.service.saveMyUser(user);
			  model.addAttribute("error", "Successfully Registered");
				return "registration";
		  }else {
				model.addAttribute("error", "Email already exist");
				return "registration";
			}
	}
	
	
	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		model.addAttribute("User", this.service.getAllUsers());
		 
		return "getAllUsers";
	}
	
	
	
	
	
		
}
	
	
	
	
	/*
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		
		return "login";
	}
	
	*/
	
	
	/*
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		
		 boolean isValidUser = service.validateUser(name, password);

	        if (!isValidUser) {
	            model.put("errorMessage", "Invalid Credentials");
	            return "login";
	        }
	        model.put("name", name);
	        model.put("password", password);

	        return "welcome";
		
	}
	*/
	
	/*
	 
	 @Value("${mymessage}")
    private String message;
    
    
	  @GetMapping("/getMessage")
    public String getMessage(Model model) {

        model.addAttribute("message", message);
        return "welcome";
    }

    @GetMapping("/getMessageMap")
    public String getMessageMap(ModelMap model) {

        model.put("message", message);
        return "welcome";
    }
    
	 */
	

