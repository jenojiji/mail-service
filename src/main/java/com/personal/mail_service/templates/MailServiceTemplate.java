package com.personal.mail_service.templates;

import jakarta.mail.MessagingException;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface MailServiceTemplate {
    void sendEmail(To to, From from,FromName fromName, Subject subject, String body) throws MessagingException, UnsupportedEncodingException;
    void sendEmailEvent(To to, Event event);
    void sendBatchEmail(List<To> recipients, From from, Subject subject, String body);
}
