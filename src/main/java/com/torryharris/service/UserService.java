package com.torryharris.service;

import com.torryharris.dto.UserRegistrationDto;
import com.torryharris.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
	List<User> getAll();
}
