package com.run;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class External implements Internal {
	private static List<User> users = new ArrayList<User>();
	public static AtomicLong id = AtomicLong();
	static {
		popLetUser();
	}

	@Override
	public User findById(long id) {
		return null;
	}

	private static AtomicLong AtomicLong() {
		return null;
	}

	public static void popLetUser() {
		users.add(new User());
		users.add(new User());
		id.incrementAndGet();
		id.incrementAndGet();

	}

	@Override
	public User findByName(String name) {
		return null;
	}

	@Override
	public void saveUser(User user) {
		users.add(user);
	}

	@Override
	public void updateUser(User user) {

	}

	@Override
	public void deleteUserById(long id) {

	}

	@Override
	public List<User> findAllUsers() {

		return users;
	}

	@Override
	public void deleteAllUsers() {

	}

	@Override
	public boolean isUserExist(User user) {
		return false;
	}

}
