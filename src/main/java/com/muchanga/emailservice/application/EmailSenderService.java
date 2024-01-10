package com.muchanga.emailservice.application;

import com.muchanga.emailservice.adapters.EmailSenderGeteway;
import com.muchanga.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGeteway emailSenderGeteway;
    @Autowired
    public EmailSenderService(EmailSenderGeteway emailGeteway){
        this.emailSenderGeteway = emailGeteway;
    }
    @Override
    public void sendeEmail(String to, String subject, String body) {
        this.emailSenderGeteway.sendEmail(to, subject,body);

    }
}
