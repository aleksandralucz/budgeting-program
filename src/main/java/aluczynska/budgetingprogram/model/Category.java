package aluczynska.budgetingprogram.model;

import javax.persistence.Column;

public class Category extends Budget{
    @Column(name = "category")
    private String category;

    @Column(name = "value")
    private double value;
}
