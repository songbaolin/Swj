package com.inspur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
   
	  public String Hello(){
		System.out.println(".................");
	 return "springboot";
	}
}
