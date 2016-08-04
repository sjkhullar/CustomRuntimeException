package org.learn.client;

import org.learn.dao.UserDao;
import org.learn.exception.UserNotFoundException;
import org.learn.model.User;

public class UserService {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		String id = "1";
		// Get user by id 1
		User user = userDao.getUserById(id);
		System.out.printf("1. Got user with id %s is :%s\n", id, user);

		System.out.printf("2. Delete user with id %s\n", id);
		user = userDao.delete(id);

		// Get user by id 1, which does not exist
		try {
			user = userDao.getUserById(id);
			System.out.printf("3. Got user with id %s is :%s", id, user);
		} catch (UserNotFoundException e) {
			System.out.printf("3. Unable to get user, userId=%s, message:%s\n", e.getUserId(), e.getMessage());
		}

		// delete user by id 10, which does not exist
		id = "20";
		try {
			user = userDao.delete(id);
			System.out.printf("4. deleted user with id %s is :%s", id, user);
		} catch (UserNotFoundException e) {
			System.out.printf("4. Unable to delete user, userId=%s, message:%s\n", e.getUserId(), e.getMessage());
		}

		// delete user by id 10, which does not exist
		id = "1";
		try {
			user = userDao.update(id, null);
			System.out.printf("5. update user with id %s is :%s", id, user);
		} catch (UserNotFoundException e) {
			System.out.printf("5. Unable to update user, userId=%s, message:%s\n", e.getUserId(), e.getMessage());
		}
	}
}
