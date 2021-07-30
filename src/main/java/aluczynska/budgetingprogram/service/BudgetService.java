package aluczynska.budgetingprogram.service;

import aluczynska.budgetingprogram.model.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//same as Component
public class BudgetService{

    private final BudgetRepository budgetRepository;
    @Autowired
    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public List<Budget> getBudget(){
        return  budgetRepository.findAll();//return a list
    }
}
