package aluczynska.budgetingprogram.repository;

import aluczynska.budgetingprogram.entity.Budget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepo extends JpaRepository<Budget, Long> {

}
