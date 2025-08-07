package com.example.springboot.repository;

import com.example.springboot.model.ProductSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSuggestionRepository extends JpaRepository<ProductSuggestion, Integer> {
} 