package aluczynska.budgetingprogram.repository;

import aluczynska.budgetingprogram.accounts.Account;
import aluczynska.budgetingprogram.accounts.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAllByTypeOrderByNameAsc(AccountType accountType);

    Account findByName(String name);

    List<Account> findAllByType(AccountType accountType);

    List<Account> findAllByTypeAndAccountStateOrderByNameAsc(AccountType accountType);

    Account findByIsSelected(boolean isSelected);

    Account findByIsDefault(boolean isDefault);
}
