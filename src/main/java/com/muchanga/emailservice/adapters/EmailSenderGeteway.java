package com.muchanga.emailservice.adapters;

public interface EmailSenderGeteway {
    void sendEmail(String to,String subject, String body);
}
