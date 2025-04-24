package ma.ac.usmba.challenge.service.impl;

import ma.ac.usmba.challenge.dto.BankResponse;
import ma.ac.usmba.challenge.dto.CreditDebitRequest;
import ma.ac.usmba.challenge.dto.EnquiryRequest;
import ma.ac.usmba.challenge.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditDebitRequest creditDebitRequest);
    BankResponse debitAccount(CreditDebitRequest creditDebitRequest);

}
