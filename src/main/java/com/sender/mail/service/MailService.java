package com.sender.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	
	@Autowired 
    private JavaMailSender javaMailSender;
    
    public void sendEmail(String to, String sub, String msg) {
    	SimpleMailMessage sm = new SimpleMailMessage();
    	sm.setTo(to);
    	sm.setSubject(sub);
    	sm.setText(msg);
    	javaMailSender.send(sm);
    }
}
