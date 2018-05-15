package com.logic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Info {
	@RequestMapping("/")
	//@ResponseBody
	public String meth() {
		return "index";
	}

}
