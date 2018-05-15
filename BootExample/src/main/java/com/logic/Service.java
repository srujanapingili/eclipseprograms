package com.logic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	@RequestMapping("/add")
	public String meth(@RequestParam("a") int x,@RequestParam("b") int y) {
		int z=x+y;
		return (z)+"";
	}

}
