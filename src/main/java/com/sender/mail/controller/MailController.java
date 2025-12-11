package com.sender.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sender.mail.service.MailService;



@RestController
@RequestMapping("/mail")
public class MailController {
	@Autowired 
	private MailService mailService;
	
	@GetMapping("/send")
	public String send() {
		mailService.sendEmail("swati35362@gmail.com", "test", "hello");
		return "Send Successfully";
	}
}
