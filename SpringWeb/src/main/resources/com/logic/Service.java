package com.logic;

@Controller
public class Service {
	public class HelloController {

		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		@ResponseBody
		public String printHello() {

			return "hello";
		}

	}

}
