package aluczynska.budgetingprogram.controller;

import aluczynska.budgetingprogram.model.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")

public class BudgetController {

    @Autowired
    private final BudgetRepo repository;


     @PostMapping("/budget")
     public Budget addBudget(@RequestBody Budget budget){
         return repository.save(budget);
     }

     //ResponseEntity - Z jej pomocą możemy łatwo zdefiniować jaki status HTTP powinien być zwrócony.
    //pomocnicza metodsa ok
    @PostMapping("/budget")
    public ResponseEntity< List<Budget>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }


//    @GetMapping("budget/{id}")
//    public



}
