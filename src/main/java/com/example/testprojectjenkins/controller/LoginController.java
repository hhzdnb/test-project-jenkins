package com.example.testprojectjenkins.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class LoginController {


	@GetMapping( "/hello")
	public String hello(){
		return "my first test project";
	}


}