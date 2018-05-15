package com.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public ModelAndView service(HttpServletRequest req, HttpServletResponse res) {
		String i = req.getParameter("t1");
		String j = req.getParameter("t2");
		String k = i + j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addition");
		mv.addObject("result", k);
		return mv;

	}

}
