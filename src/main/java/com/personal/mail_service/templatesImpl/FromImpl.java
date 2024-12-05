package com.personal.mail_service.templatesImpl;

import com.personal.mail_service.templates.From;

public class FromImpl implements From {
    private final String from;

    public FromImpl(String from) {
        this.from = from;
    }

    @Override
    public String from() {
        return from;
    }
}
