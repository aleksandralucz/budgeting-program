package aluczynska.budgetingprogram.service;

import aluczynska.budgetingprogram.entity.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BudgetService implements  IBudgetService{

    @Autowired
    private BudgetRepo repository;

    @Override
    public List<Budget> findAll() {
        var budgets = (List<Budget>) repository.findAll();
        return budgets;
    }
}