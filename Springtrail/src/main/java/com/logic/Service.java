package com.logic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


	@Controller
	public class Service {
		
		@RequestMapping()
		@ResponseBody
		public String meth() {
			return "new";
		}
		
		
		//@ResponseBody
		 @RequestMapping(value = "/hello", method = RequestMethod.GET)
		  public String showRegister() {
		    
		    
		    return "index";
		  }


	}


