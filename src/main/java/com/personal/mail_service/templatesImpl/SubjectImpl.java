package com.personal.mail_service.templatesImpl;

import com.personal.mail_service.templates.Subject;

public class SubjectImpl implements Subject {
    private final String subject;

    public SubjectImpl(String subject) {
        this.subject = subject;
    }

    @Override
    public String subject() {
        return subject;
    }
}
