package com.tek.details;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
	
	@RequestMapping()
	@ResponseBody
	public String meth() {
		return "new";
	}
	
	
	//@ResponseBody
	 @RequestMapping(value = "/hello", method = RequestMethod.GET)
	  public String showRegister() {
	    
	    
	    return "new";
	  }


}
