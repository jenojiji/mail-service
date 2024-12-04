package com.personal.mail_service.templates;

import java.util.List;

public interface MailServiceTemplate {
    void sendEmail(To to, From from, Subject subject, String body);
    void sendEmailEvent(To to, Event event);
    void sendBatchEmail(List<To> recipients, From from, Subject subject, String body);
}
