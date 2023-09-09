package com.example.yes1.services;


import com.example.yes1.repository.CategoriesRepository;
import com.example.yes1.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoriesRepository categoriesRepository;

    @Autowired
    public CategoryServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories getCategoryById(Long id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    @Override
    public Categories createCategory(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public Categories updateCategory(Long id, Categories categories) {
        if (categoriesRepository.existsById(id)) {
            categories.setId(id);
            return categoriesRepository.save(categories);
        }
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        categoriesRepository.deleteById(id);
    }
}
