package com.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.exception.NotificationServiceException;
import com.pms.modal.EmailRequest;
import com.pms.service.NotificationService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins={"http://localhost:4200","https://d2sp5bzn9zomrp.cloudfront.net/"})
public class NotificationController {

	@Autowired
	NotificationService notificationService;

	
	// API to send email
	@PostMapping("/email-notification")
	public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) throws NotificationServiceException {
		System.out.println(request);

		boolean result = this.notificationService.sendEmail(request.getSubject(), request.getMessage(),
				request.getTo());

		if (result) {
			return ResponseEntity.ok("Email sent successfully.");
		} else {
			throw new NotificationServiceException("Email is not valid ");

		}
	}

}
