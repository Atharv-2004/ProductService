package com.dvyne.productservice.repositories;

import com.dvyne.productservice.models.Category;
import com.dvyne.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    Category save(Category category);
}