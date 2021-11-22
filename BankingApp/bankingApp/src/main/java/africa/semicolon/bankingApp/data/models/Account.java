package africa.semicolon.bankingApp.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Data
public class Account {
    private final BigDecimal balance = BigDecimal.ZERO;
    private String customerId;
    private String number;
    private AccountType type;

}
