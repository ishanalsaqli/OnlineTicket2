package com.example.demo.service;

public interface EmailService {
    public String sendmail(String toEmail,
                                  String body,
                                  String subject);
}
