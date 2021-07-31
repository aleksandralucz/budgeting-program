package aluczynska.budgetingprogram.service;

import aluczynska.budgetingprogram.model.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
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

    public void deleteBudget(Long budgetId) {
        boolean exists = budgetRepository.existsById(budgetId);
        if(!exists)
        {
            throw new IllegalStateException("budget with id "+ budgetId + "does ot exists");
        }
        budgetRepository.deleteById(budgetId);
    }
    }
