
package org.learn.dao;

import org.learn.exception.UserNotFoundException;
import org.learn.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

	@SuppressWarnings("serial")
	private Map<String, User> databaseUser = new HashMap<String, User>() {
		{
			put("1", new User("1", "Angelina", 35, "Cambodia", "Female"));
			put("2", new User("2", "Brad", 46, "Shawnee", "Male"));
			put("3", new User("3", " Jennifer", 41, "LA", "Female"));
			put("4", new User("4", "Justin", 38, " Washington", "Male"));
			put("5", new User("5", "Marcel ", 42, "Cambodia", "Male"));
		}
	};

	public User getUserById(String id) {
		if (!isUserExists(id)) {
			throw new UserNotFoundException("User does not exists in database", id);
		}
		return databaseUser.get(id);
	}

	public User update(String id, User user) {
		if (!isUserExists(id)) {
			throw new UserNotFoundException("Update failed, User does not exist", id);
		}
		return databaseUser.put(id, user);
	}

	public User delete(String id) {
		if (!isUserExists(id)) {
			throw new UserNotFoundException("User does not exists in database", id);
		}
		return databaseUser.remove(id);
	}

	private boolean isUserExists(String id) {
		return databaseUser.containsKey(id);
	}
}
