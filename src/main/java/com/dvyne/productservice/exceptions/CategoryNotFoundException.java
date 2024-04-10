package com.dvyne.productservice.exceptions;

import com.dvyne.productservice.repositories.CategoryRepository;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message) {
        super(message);
    }
}