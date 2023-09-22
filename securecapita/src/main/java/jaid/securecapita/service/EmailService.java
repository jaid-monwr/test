package jaid.securecapita.service;

import jaid.securecapita.enumeration.VerificationType;

public interface EmailService {
    void sendVerificationEmail(String firstName, String email, String verificationUrl, VerificationType verificationType);
}
