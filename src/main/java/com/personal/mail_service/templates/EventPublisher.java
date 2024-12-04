package com.personal.mail_service.templates;

public interface EventPublisher {
    void publish(boolean success, String sentLog);
}
