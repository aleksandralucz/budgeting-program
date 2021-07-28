package aluczynska.budgetingprogram.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int budgetAmount;
    private String category;
    private String currency;

    public Budget(){
    }

}
