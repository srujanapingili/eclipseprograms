package com.logic;

import org.springframework.beans.factory.annotation.Autowired;

public class DepenDuo{
	@Autowired
	Dao dao;
	public String toString() {
		return "depen class tostring method is" +dao + "good";
	}

}
