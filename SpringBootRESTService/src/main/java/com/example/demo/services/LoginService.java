package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository lrepo;
	
	public String checkLogin(String uid, String pwd) {
		
		return lrepo.checkLogin(uid, pwd);
	}
}
