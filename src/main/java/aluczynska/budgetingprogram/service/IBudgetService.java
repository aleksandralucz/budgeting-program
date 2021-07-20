package aluczynska.budgetingprogram.service;

import aluczynska.budgetingprogram.entity.Budget;

import java.util.List;

public interface IBudgetService {

    List<Budget> findAll();
}
