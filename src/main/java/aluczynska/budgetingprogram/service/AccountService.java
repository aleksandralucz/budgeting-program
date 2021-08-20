package aluczynska.budgetingprogram.service;


import aluczynska.budgetingprogram.accounts.Account;
import aluczynska.budgetingprogram.repository.AccountRepository;
import aluczynska.budgetingprogram.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements  AccessAllEntities<Account> {
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

	private final AccountRepository accountRepository;
	private final UserRepository userRepository;

	@Autowired
	public AccountService(AccountRepository accountRepository, UserRepository userRepository) {
		this.accountRepository = accountRepository;

		this.userRepository = userRepository;
	}

	public AccountRepository getRepository() {
		return accountRepository;
	}


	public void deleteAccount(long id) {
		Optional<Account> accountToDeleteOptional = accountRepository.findById(id);
		if (accountToDeleteOptional.isEmpty()) {
			return;
		}


	}

	@Override
	public List<Account> getAllEntitiesAsc() {
		return null;
	}
}
