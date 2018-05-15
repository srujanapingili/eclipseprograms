package com.logic;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Service {
	@GetMapping("/request/{name}")
	@ResponseBody
	public String meth(@PathVariable(value = "name") String x) {
		return "the given name is <br>" + x;
	}

	@GetMapping("/request/{username}/{password}")
	@ResponseBody
	public String met(@PathVariable(name = "username") String st, @PathVariable(name = "password") String str) {
		return "the given credentials are <br>" + st + "<br>" + str;

	}

	@GetMapping("/request3/{name}/{age}/{salary}/{height}/{active}")
	@ResponseBody
	public String me(@PathVariable String name, @PathVariable String age, @PathVariable String salary,
			@PathVariable String height, @PathVariable boolean active) {
		return "the given details are" + name + "<br>" + age + "<br>" + salary + "<br>" + height + "<br>" + active;
	}

	@GetMapping("/request/{name}/{age}/{phone number}/{city}/{country}")
	@ResponseBody
	public String m(@PathVariable Map<String, String> param) {
		StringBuilder build = new StringBuilder();
		build.append("url is");
		for (java.util.Map.Entry<String, String> entry : param.entrySet()) {
			build.append(entry.getKey() + "=" + entry.getValue());

		}
		return build.toString();
	}

	

}
