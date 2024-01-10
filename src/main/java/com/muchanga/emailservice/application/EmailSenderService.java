package com.muchanga.emailservice.application;

import com.muchanga.emailservice.adapters.EmailSenderGeteway;
import com.muchanga.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGeteway emailSenderGeteway;
    @Autowired
    public EmailSenderService(EmailSenderGeteway emailGeteway){
        this.emailSenderGeteway = emailGeteway;
    }
    @Override
    public void sendeEmail(String to, String subject, String body) {

    }
}
