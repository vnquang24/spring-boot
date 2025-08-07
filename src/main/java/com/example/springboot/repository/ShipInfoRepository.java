package com.example.springboot.repository;

import com.example.springboot.model.ShipInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipInfoRepository extends JpaRepository<ShipInfo, Integer> {
} 