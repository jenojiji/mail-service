package com.personal.mail_service.templates;

import com.personal.mail_service.Recipient;

public interface HTMLTemplate {
    String html();
    default String html(Recipient recipient) {throw new RuntimeException("Not implemented");}
}
