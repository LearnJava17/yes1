package com.example.yes1.services;

import com.example.yes1.entities.Categories;

import java.util.List;

public interface CategoryService {
    List<Categories> getAllCategories();
    Categories getCategoryById(Long id);
    Categories createCategory(Categories category);
    Categories updateCategory(Long id, Categories category);
    void deleteCategory(Long id);
}
