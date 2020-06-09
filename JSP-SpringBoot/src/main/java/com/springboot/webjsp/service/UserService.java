package com.springboot.webjsp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.webjsp.entity.User;
import com.springboot.webjsp.repository.UserRepository;

@Service
@Transactional
public class UserService {

	
	private final UserRepository userRepo;
		
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	
	public void saveMyUser(User user) {
		this.userRepo.save(user);
	}

	public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("uname")
                && password.equalsIgnoreCase("password");
    }

	public boolean validateUser(User user) {
		
		
		User userCheck = this.userRepo.findByEmail(user.getEmail());
		
		if (userCheck != null) {
			
			if(userCheck.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		 
		return false;
	}

	public boolean loginUser(User user) {
		
		User userCheck = this.userRepo.findByEmailAndAndPassword(user.getEmail(), user.getPassword());
	
		if(userCheck != null) {
			return true;
		}
		return false;
	}

	public User checkEmail(String email) {
				
		return this.userRepo.findByEmail(email);
	}


	public List<User> getAllUsers() {
		return this.userRepo.findAll();
	}
	
		
	
}
