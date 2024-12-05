package com.personal.mail_service;

import com.personal.mail_service.templates.*;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Component
public class SMTPMailService implements MailServiceTemplate {

    private final JavaMailSender javaMailSender;

    public SMTPMailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(To to, From from, FromName fromName, Subject subject, String body) throws MessagingException, UnsupportedEncodingException {

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setTo(to.to());
        helper.setFrom(from.from(), fromName.fromName());
        helper.setSubject(subject.subject());
        helper.setText(body);
        javaMailSender.send(message);

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
