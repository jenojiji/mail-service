package com.personal.mail_service;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class MailController {
    private final MailService mailService;

    @Autowired
    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/test")
    public String sendTestEmail() throws MessagingException, UnsupportedEncodingException {
        mailService.sendTestEmail();
        return "Test Email Sent!";
    }

    @GetMapping("/event")
    public String sendEventEmail() {
        mailService.sendEventEmail();
        return "Event Email Sent!";
    }

    @GetMapping("/batch")
    public String sendBatchEmail() {
        mailService.sendBatchEmail();
        return "Batch Email Sent!";
    }

}
