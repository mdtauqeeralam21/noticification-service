package com.pms.exception;

public class NotificationServiceException extends Exception {
	private static final long serialVersionUID = 526706541554094375L;

	public NotificationServiceException(String message) {
		super(message);
	}

	public NotificationServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotificationServiceException(Throwable cause) {
		super(cause);
	}

}
