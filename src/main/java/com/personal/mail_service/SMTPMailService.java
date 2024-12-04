package com.personal.mail_service;

import com.personal.mail_service.templates.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SMTPMailService implements MailServiceTemplate {

    @Override
    public void sendEmail(To to, From from, Subject subject, String body) {
        System.out.println("SMTP Sending Email:");
        System.out.println("To: " + to.to());
        System.out.println("From: " + from.from());
        System.out.println("Subject: " + subject.subject());
        System.out.println("Body: " + body);
    }

    @Override
    public void sendEmailEvent(To to, Event event) {
        System.out.println("SMTP Sending Event Email:");
        System.out.println("To: " + to.to());
        System.out.println("Event: " + event.event());
    }

    @Override
    public void sendBatchEmail(List<To> recipients, From from, Subject subject, String body) {
        System.out.println("SMTP Sending Batch Email:");
        for (To recipient : recipients) {
            System.out.println("To: " + recipient.to());
        }
        System.out.println("From: " + from.from());
        System.out.println("Subject: " + subject.subject());
        System.out.println("Body: " + body);
    }
}
