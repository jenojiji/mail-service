package com.personal.mail_service.templates;

import com.personal.mail_service.Recipient;

import java.util.Collections;
import java.util.List;

public interface To {
//    default List<Recipient> toList() {
//        return Collections.singletonList(new Recipient(to(), ""));
//    }

    String to();
}
