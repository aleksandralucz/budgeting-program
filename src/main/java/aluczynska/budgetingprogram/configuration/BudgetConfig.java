package aluczynska.budgetingprogram.configuration;


import aluczynska.budgetingprogram.model.Budget;
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
            Budget budgetForFood = new Budget(1L,
                    700,
                    "PLN",
                    "food"
            );
            Budget budgetForClothes = new Budget(
                    2L,
                    400,
                    "PLN",
                    "clothes"
            );

            repository.saveAll(
                    List.of(budgetForFood, budgetForClothes)
            );
        };
    }
}
