package com.tek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	@RequestMapping("/")
	public String add() {
		return "welcome";
	}

}
