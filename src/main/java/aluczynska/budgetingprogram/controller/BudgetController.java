package aluczynska.budgetingprogram.controller;

import aluczynska.budgetingprogram.model.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepo;
import aluczynska.budgetingprogram.service.BudgetService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api")

public class BudgetController {


    private final BudgetService budgetService;

    @Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping(path ="/budget")
    public List<Budget> getBudget() {
        return budgetService.getBudget();
    }


}

//
//     @RequestMapping(path ="/budget")
//     public Budget addBudget(@RequestBody Budget budget){
//         return repository.save(budget);
//     }

