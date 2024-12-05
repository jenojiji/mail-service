package com.personal.mail_service.templatesImpl;

import com.personal.mail_service.templates.FromName;

public class FromNameImpl implements FromName {
    private final String fromName;

    public FromNameImpl(String fromName) {
        this.fromName = fromName;
    }

    @Override
    public String fromName() {
        return fromName;
    }
}
