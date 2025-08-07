package com.example.springboot.repository;

import com.example.springboot.model.Reason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReasonRepository extends JpaRepository<Reason, Integer> {
} 