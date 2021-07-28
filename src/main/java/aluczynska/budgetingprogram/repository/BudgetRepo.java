package aluczynska.budgetingprogram.repository;

import aluczynska.budgetingprogram.model.Budget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepo extends JpaRepository<Budget, Long> {

}
