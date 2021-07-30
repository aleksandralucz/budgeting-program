package aluczynska.budgetingprogram.service;

import aluczynska.budgetingprogram.model.Budget;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//same as Component
public class BudgetService{

    public List<Budget> getBudget(){
        return List.of(
                new Budget(
                        1L,
                        1000,
                        "PLN",
                        "food"
                )
        );
    }
}
