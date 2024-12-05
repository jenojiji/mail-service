package com.personal.mail_service.templatesImpl;

import com.personal.mail_service.Recipient;
import com.personal.mail_service.templates.To;

import java.util.List;

public class ToImpl implements To {
    private final String to;

    public ToImpl(String to) {
        this.to = to;
    }

//    @Override
//    public List<Recipient> toList() {
//        return To.super.toList();
//    }

    @Override
    public String to() {
        return to;
    }
}
