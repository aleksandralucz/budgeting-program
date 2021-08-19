package aluczynska.budgetingprogram.repository;

import aluczynska.category.Category;
import aluczynska.category.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    List<Category> findAllByOrderByNameAsc();

    List<Category> findAllByTypeOrderByNameAsc(CategoryType categoryType);

    Category findByName(String name);

    Category findByType(CategoryType categoryType);

    Category findByNameAndColorAndType(String name, String color, CategoryType categoryType);
}