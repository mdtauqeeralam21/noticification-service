package com.pms.service;

public interface NotificationService {
	public boolean sendEmail(String subject, String message, String[] to);

}
