package aluczynska.budgetingprogram.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction  extends Budget{
    String accountNumber;
    Date date;
    String description;
    float amount;

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return dateFormat.format(this.date);
    }
    public void setDate(Date newDate) {
        this.date = date;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getDescription() {
        return description;
    }

    public float getAmount() {
        return amount;
    }
}
