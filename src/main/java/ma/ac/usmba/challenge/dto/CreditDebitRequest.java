package ma.ac.usmba.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDebitRequest {
    private BigDecimal amount;
    private String accountNumber;
}
