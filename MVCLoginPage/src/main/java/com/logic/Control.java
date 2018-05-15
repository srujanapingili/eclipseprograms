package com.logic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	@RequestMapping(value="/meth",method=RequestMethod.GET)

	public ModelAndView view(@RequestParam String a,@RequestParam String b) {
		String x=a+b;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("result1", x);

		return mv;
	}

}
