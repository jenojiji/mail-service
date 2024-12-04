package com.personal.mail_service;

import com.personal.mail_service.templates.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService {
    private final MailServiceTemplate emailService;

    @Autowired
    public MailService(MailServiceTemplate emailService) {
        this.emailService = emailService;
    }

    public void sendTestEmail() {
        To to = () -> "recipient@example.com";
        From from = () -> "sender@example.com";
        Subject subject = () -> "Test Subject";

        emailService.sendEmail(to, from, subject, "This is a test email.");
    }

    public void sendEventEmail() {
        To to = () -> "recipient@example.com";
        Event event = () -> "Your event is confirmed.";

        emailService.sendEmailEvent(to, event);
    }

    public void sendBatchEmail() {
        List<To> recipients = List.of(() -> "user1@example.com", () -> "user2@example.com");
        From from = () -> "batchsender@example.com";
        Subject subject = () -> "Batch Email Subject";

        emailService.sendBatchEmail(recipients, from, subject, "This is a batch email.");
    }
}
