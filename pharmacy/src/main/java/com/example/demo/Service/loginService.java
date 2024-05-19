package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.loginModel;
import com.example.demo.Repository.loginRepo;



@Service
public class loginService {
		
	private final loginRepo lrepo;

		  @Autowired
		  public loginService(loginRepo lrepo) {
		    this.lrepo = lrepo;
		  }

		  public loginModel signUp(loginModel user) {
		    // Check if the username already exists
		    if (lrepo.existsByUsername(user.getUsername())) {
		      throw new IllegalArgumentException("Username already exists");
		    }

		    // Check if the email already exists
		    if (lrepo.existsByEmail(user.getEmail())) {
		      throw new IllegalArgumentException("Email already exists");
		    }

		    // Save the new user in the database
		  return lrepo.save(user);
		  }

		  public String validate(String username, String password) 
			{
				loginModel userData = lrepo.findByUsername(username);
				if(userData == null)
				{
					return "User Not Found";
				}
				else
				{
					if(userData.getPassword().equals(password))
					{
						return "Login Successful";
					}
					else
					{
						return "Incorrect Password";
					}
				}
			}
		}