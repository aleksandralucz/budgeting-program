package aluczynska.budgetingprogram.repository;

import aluczynska.budgetingprogram.entity.Budget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//responsibly for data access
public interface BudgetRepository extends JpaRepository<Budget, Long> {

}
