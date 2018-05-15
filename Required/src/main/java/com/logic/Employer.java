package com.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Employer {
	String name;
	String city;

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}


}
