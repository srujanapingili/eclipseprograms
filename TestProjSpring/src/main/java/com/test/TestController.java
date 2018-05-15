package com.test;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	MyService service;

	@RequestMapping(value="/{message}")
	public String sayHello(@PathVariable("message") String message)
	{
		
		return "hello "+message;
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestHeader("user") String user, @RequestHeader("password") String password, HttpServletResponse res)
	{
		
		boolean result =  service.validateUser(user, password);
		if(result)
		{
			return "Hello SpringBoot";
		}
		else
		{
			res.setStatus(401);
			return "invalid user details : "+user;
		}
	}
	
}
