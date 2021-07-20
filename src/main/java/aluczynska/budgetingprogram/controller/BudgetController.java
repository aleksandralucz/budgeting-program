package aluczynska.budgetingprogram.controller;

import aluczynska.budgetingprogram.entity.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BudgetController {

    private final BudgetRepo repository;

    public BudgetController(BudgetRepo repo) {
        this.repository = repo;
    }

    @GetMapping(value = "/budget/all", produces = "application/json")
    public Budget getBudget() {
        return repository.getById(1L);


    }
}
