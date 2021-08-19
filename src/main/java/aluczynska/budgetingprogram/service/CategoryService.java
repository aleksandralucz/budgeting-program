package aluczynska.budgetingprogram.service;

import aluczynska.budgetingprogram.repository.CategoryRepository;
import aluczynska.category.Category;
import aluczynska.category.CategoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CategoryService implements AccessAllEntities<Category>{
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;

//        createDefaults();
    }
    public Optional<Category> findById(Long id)
    {
        return categoryRepository.findById(id);
    }

    public Category findByType(CategoryType type)
    {
        return categoryRepository.findByType(type);
    }

    public Category save(Category category)
    {
        return categoryRepository.save(category);
    }

    public void deleteCategory(int ID, Category newCategory, Long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isEmpty()) {
            throw new NoSuchElementException("Can't delete non-existing category with ID: " + id);
        }
    }

    @Override
    public List<Category> getAllEntitiesAsc() {
        return null;
    }
}
