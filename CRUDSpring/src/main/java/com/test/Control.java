package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class Control {
	@Autowired
	Internal internal;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> listAllUsers() {
		List<User> users = internal.findAllUsers();
		return users;

	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") long id) {
		System.out.println("getting user data " + id);
		User user = internal.findById(id);
		if (user == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser( User user, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + user.getUsername());

		if (internal.isUserExist(user)) {
			System.out.println("A User with name " + user.getUsername() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		internal.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
		System.out.println("Updating User " + id);

		User currentUser = internal.findById(id);

		if (currentUser == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		currentUser.setUsername(user.getUsername());
		currentUser.setAddress(user.getAddress());
		currentUser.setEmail(user.getEmail());

		internal.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
		System.out.println("deleting User with id " + id);

		User user = internal.findById(id);
		if (user == null) {
			System.out.println("Unable to delete. User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		internal.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		System.out.println("Delete All Users");

		internal.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

}
