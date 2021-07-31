package aluczynska.budgetingprogram.configuration;


import aluczynska.budgetingprogram.Category;
import aluczynska.budgetingprogram.entity.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BudgetConfig {

    @Bean
    CommandLineRunner commandLineRunner(BudgetRepository repository) {//creating b ean
        return args -> {
            Budget budget1 = new Budget(1L,
                    700,
                    "PLN",
                    Category.BEAUTY
            );
            Budget budget2 = new Budget(
                    2L,
                    400,
                    "PLN",
                    Category.BILLS
            );

            repository.saveAll(
                    List.of(budget1, budget2)
            );
        };
    }
}
