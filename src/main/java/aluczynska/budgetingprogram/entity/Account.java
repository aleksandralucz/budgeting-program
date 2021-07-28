package aluczynska.budgetingprogram.entity;

import lombok.Data;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;


@Data
public class Account  {

    private int accountId;
    private String accountName;
    private String accountType;
    private double balance;

}
