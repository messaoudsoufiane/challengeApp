package ma.ac.usmba.challenge.service.impl;

import ma.ac.usmba.challenge.dto.EmailDetails;

public interface EmailService {

    void SendEmailAlert(EmailDetails emailDetails);

}
