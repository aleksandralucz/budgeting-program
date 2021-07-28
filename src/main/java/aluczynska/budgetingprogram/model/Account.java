package aluczynska.budgetingprogram.model;

import lombok.Data;


@Data
public class Account extends Budget {

    private int accountId;
    private String accountName;
    private String accountType;
    private double balance;

}
