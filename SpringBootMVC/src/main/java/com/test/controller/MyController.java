package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   
	@RequestMapping(value="/hello")
	  public String helloSpring()
	  {
		  return "hello";
	  }
}
