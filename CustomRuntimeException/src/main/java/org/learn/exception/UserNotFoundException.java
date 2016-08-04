
package org.learn.exception;

public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 13216733298798717L;
	private final String userId;

	public UserNotFoundException(String message, String userId) {
		super(message);
		this.userId = userId;
	}

	public UserNotFoundException(String message, Throwable error, String userId) {
		super(message, error);
		this.userId = userId;
	}

	public UserNotFoundException(Throwable e, String userId) {
		super(e);
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}
}
