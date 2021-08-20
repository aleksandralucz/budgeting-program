package aluczynska.budgetingprogram.controller;

import aluczynska.budgetingprogram.accounts.Account;
import aluczynska.budgetingprogram.repository.AccountRepository;
import aluczynska.budgetingprogram.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping()
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;

    }
    public AccountRepository getRepository()
    {
        return accountService.getRepository();
    }
    public void deleteAccount(long id)
    {
        Optional<Account> accountToDeleteOptional = accountRepository.findById(ID);
        if(accountToDeleteOptional.isEmpty())
        {
            return;
        }
//
//    @Override
//    public List<Account> getAllEntitiesAsc()
//    {
//
//    }
}
