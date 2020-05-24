package com.springboot.webjsp.service;

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
	
	
	public void saveMyUser(User user ) {
		this.userRepo.save(user);
	}

	public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("uname")
                && password.equalsIgnoreCase("password");
    }

	public boolean validateUser(User user) {
		
		return user.getFirstname().equalsIgnoreCase("uname") 
				&& user.getPassword().equalsIgnoreCase("password");
		
	}
	
	
	
	
	
}
