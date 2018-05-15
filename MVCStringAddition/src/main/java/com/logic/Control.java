package com.logic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public ModelAndView service(@RequestParam String a,@RequestParam String b) {
		String k = a + b;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addition");
		mv.addObject("result", k);
		return mv;

	}

}
