package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	Map<String, String> userData = new HashMap<String, String>();

	MyService() {
		userData.put("user1", "1234");
	}

	public boolean validateUser(String username, String pw) {
		if (userData.containsKey(username)) {
			if (userData.get(username).equals(pw)) {
				return true;
			}
		}
		return false;
	}
}
