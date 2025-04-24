package ma.ac.usmba.challenge.controller;

import ma.ac.usmba.challenge.dto.BankResponse;
import ma.ac.usmba.challenge.dto.CreditDebitRequest;
import ma.ac.usmba.challenge.dto.EnquiryRequest;
import ma.ac.usmba.challenge.dto.UserRequest;
import ma.ac.usmba.challenge.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Endpoint pour créer un compte utilisateur
     */
    @PostMapping("/create-account")
    public ResponseEntity<BankResponse> createAccount( @RequestBody UserRequest userRequest) {
        // Appeler le service pour créer le compte
        BankResponse response = userService.createAccount(userRequest);

        // Retourner la réponse avec un statut HTTP approprié
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        BankResponse response = userService.balanceEnquiry(enquiryRequest);
        return response;

    }
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return userService.nameEnquiry(enquiryRequest);
    }
    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest){
        return userService.creditAccount(creditDebitRequest);
    }

    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest creditDebitRequest){
        return userService.debitAccount(creditDebitRequest);
    }





}