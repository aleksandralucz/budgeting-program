package aluczynska.budgetingprogram;


import aluczynska.budgetingprogram.accounts.Account;
import aluczynska.budgetingprogram.accounts.AccountType;
import aluczynska.budgetingprogram.repository.AccountRepository;
import aluczynska.budgetingprogram.service.AccountService;
import aluczynska.budgetingprogram.service.CategoryService;
import aluczynska.category.Category;
import aluczynska.category.CategoryType;


import org.junit.Test;

import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.io.IOException;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
public class DatabaseExportTest
{




	@Mock
	private AccountService accountService;

	@Mock
	private CategoryService categoryService;


	@Test
	public void test_specialFields() throws IOException {
		// categories
		Mockito.when(categoryService.getAllEntitiesAsc()).thenReturn(List.of());

		// accounts
		AccountRepository accountRepositoryMock = Mockito.mock(AccountRepository.class);
		Mockito.when(accountRepositoryMock.findAll()).thenReturn(List.of());
		Mockito.when(accountService.getRepository()).thenReturn(accountRepositoryMock);
	}

	@Test
	public void test_exportDatabase() throws IOException {

		Category categoryNone = new Category("NONE", "#000000", CategoryType.NONE);
		categoryNone.setid(1);
		Category categoryCustom = new Category("my First Category", "#FF0000", CategoryType.CUSTOM);
		categoryCustom.setID(2);
		Mockito.when(categoryService.getAllEntitiesAsc()).thenReturn(List.of(categoryNone, categoryCustom));

		// accounts
		Account account1 = new Account("Source_Account_1", AccountType.CUSTOM);
		account1.setID(2);
		Account account2 = new Account("Source_Account_2", AccountType.CUSTOM);
		account2.setID(3);

		AccountRepository accountRepositoryMock = Mockito.mock(AccountRepository.class);
		Mockito.when(accountRepositoryMock.findAll()).thenReturn(List.of(account1, account2));
		Mockito.when(accountService.getRepository()).thenReturn(accountRepositoryMock);
	}
}
