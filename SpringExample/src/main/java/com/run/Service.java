package com.run;

import java.awt.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") long id){
	
		
		
		
		
		return new ResponseEntity<User>;	
	
	
	
	
	}

	@RequestMapping(value="/",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllUser() {
		
		
		
		
		
		
		
		
		return new ResponseEntity<List<User>>;
	}

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public void create(@PathVariable long id) {

	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> update(@PathVariable("id") long id) {

	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) {

	}

	@RequestMapping(value = "/",method=RequestMethod.DELETE)
	public void deleteAll() {

	}
}
