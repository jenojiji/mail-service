package com.personal.mail_service.templatesImpl;

import com.personal.mail_service.templates.Event;

public class EventImpl implements Event {
    private final String event;

    public EventImpl(String event) {
        this.event = event;
    }

    @Override
    public String event() {
        return event;
    }
}
