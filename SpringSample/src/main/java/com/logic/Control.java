package com.logic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
	@RequestMapping("/add")
	public String meth() {
		return "srujana";
	}

}
