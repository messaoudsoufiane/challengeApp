package ma.ac.usmba.challenge.utils;

import java.time.Year;

public class AccountUtils {



    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_EXISTS_MESSAGE="Account already exists";

    public static final String ACCOUNT_CREATION_SUCCESS_CODE="002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE="Account creation successful";


    public static  String generateAccountNumber() {
        /**
         *2025 + RondomSixDigite
         */
        Year currentYear=Year.now();
        int min=100000;
        int max=2000334;
        //Generate Rondom Number
        int randNumber=(int) (Math.random()*(max-min+1)+min);
        //convert The Rondom Number To String
        String Year = String.valueOf(currentYear.getValue());
        String randomNumber=String.valueOf(randNumber);
        StringBuilder accountNumber=new StringBuilder();
        return accountNumber.append(Year).append(randomNumber).toString();
    }

}
