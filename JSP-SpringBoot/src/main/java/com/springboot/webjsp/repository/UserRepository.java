package com.springboot.webjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.webjsp.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
