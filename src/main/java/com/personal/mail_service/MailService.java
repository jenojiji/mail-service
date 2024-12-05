package com.personal.mail_service;

import com.personal.mail_service.templates.*;
import com.personal.mail_service.templatesImpl.FromImpl;
import com.personal.mail_service.templatesImpl.FromNameImpl;
import com.personal.mail_service.templatesImpl.SubjectImpl;
import com.personal.mail_service.templatesImpl.ToImpl;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public class MailService {

    @Autowired
    private SMTPMailService emailService;


    public void sendTestEmail() throws MessagingException, UnsupportedEncodingException {
        To to = new ToImpl("jenojiji001@gmail.com");
        From from = new FromImpl("jenoattickal013@gmail.com");
        Subject subject = new SubjectImpl("Test Subject");
        FromName fromName=new FromNameImpl("Jeno Jiji");

        emailService.sendEmail(to, from,fromName, subject, "This is a test email.");
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
