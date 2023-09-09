package com.example.yes1.controllers;

import com.example.yes1.entities.Categories;
import com.example.yes1.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Categories> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Categories getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Categories createCategory(@RequestBody Categories categories) {
        return categoryService.createCategory(categories);
    }

    @PutMapping("/{id}")
    public Categories updateCategory(@PathVariable Long id, @RequestBody Categories categories) {
        return categoryService.updateCategory(id, categories);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
