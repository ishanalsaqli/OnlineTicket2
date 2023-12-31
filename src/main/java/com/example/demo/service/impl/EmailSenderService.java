package com.example.demo.service.impl;

import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailSenderService implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public String sendmail(String toEmail,
                                  String body,
                                  String subject) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("isaqhuseyn97@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("Mail Send...");
        return toEmail;
    }




}