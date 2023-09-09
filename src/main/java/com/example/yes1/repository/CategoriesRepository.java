package com.example.yes1.repository;

import com.example.yes1.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}