package aluczynska.budgetingprogram;

import aluczynska.budgetingprogram.entity.Budget;
import aluczynska.budgetingprogram.repository.BudgetRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories
public class BudgetingProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetingProgramApplication.class, args);
	}

	}
