package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.AIPrediction;
import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AIPredictionRepositories extends JpaRepository<AIPrediction, Integer> {
    List<AIPrediction> findByUserId(Long userId);
}
