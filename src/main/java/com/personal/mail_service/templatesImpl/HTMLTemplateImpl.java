package com.personal.mail_service.templatesImpl;

import com.personal.mail_service.Recipient;
import com.personal.mail_service.templates.HTMLTemplate;

public class HTMLTemplateImpl implements HTMLTemplate {
    private final String html;


    public HTMLTemplateImpl(String html) {
        this.html = html;
    }

    @Override
    public String html() {
        return html;
    }

    @Override
    public String html(Recipient recipient) {
        return HTMLTemplate.super.html(recipient);
    }
}
