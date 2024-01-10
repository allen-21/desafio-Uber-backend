package com.muchanga.emailservice.core;

public interface EmailSenderUseCase {
    void sendeEmail(String to, String subject, String body);
}
