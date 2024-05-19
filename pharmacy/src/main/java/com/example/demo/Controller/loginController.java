package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.loginModel;
import com.example.demo.Service.loginService;

import org.springframework.web.bind.annotation.RequestMapping;
@RestController

@CrossOrigin
public class loginController {
	 private final loginService lser;

		  @Autowired
		  public loginController(loginService lser) {
		    this.lser = lser;
		  }

		  @PostMapping("/signup")
		  public ResponseEntity<?> signUp(@RequestBody loginModel user) {
		    try {
		      loginModel newUser = lser.signUp(user);
		      return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
		    } catch (IllegalArgumentException e) {
		      return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
		    }
		  }

		  @PostMapping("/login")
		  public String login(@RequestBody Map<String,String> mp)
		  {
			  String username = mp.get("username");
			  String password = mp.get("password");
			  return lser.validate(username, password);
		  }
		}