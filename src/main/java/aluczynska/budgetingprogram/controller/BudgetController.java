package aluczynska.budgetingprogram.controller;

import aluczynska.budgetingprogram.model.Budget;
import aluczynska.budgetingprogram.model.User;
import aluczynska.budgetingprogram.service.BudgetService;
import aluczynska.budgetingprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api")

public class BudgetController {


    private final BudgetService budgetService;
    private final UserService userService;

    @Autowired
    public BudgetController(BudgetService budgetService, UserService userService) {
        this.budgetService = budgetService;
        this.userService = userService;
    }

    @GetMapping(path ="/budget")
    public List<Budget> getBudget() {
        return budgetService.getBudget();
    }


    @PostMapping
    public void registerNewUser(@RequestBody User user) {
        userService.addNew(user);

    }
    @DeleteMapping(path = "(userId}")
    public void deleteUser(@PathVariable("userId")Long userId) {
        userService.deleteUser(userId);
    }
    @DeleteMapping(path = "(budgetId}")
    public void deleteBudget(@PathVariable("budgetId")Long budgetId) {
budgetService.deleteBudget(budgetId);
    }

}

