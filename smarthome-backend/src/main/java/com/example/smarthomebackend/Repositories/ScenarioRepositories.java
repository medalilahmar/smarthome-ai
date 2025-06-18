package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.Scenario;
import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScenarioRepositories extends JpaRepository<Scenario, Long> {
    List<Scenario> findByUserId(Long userId);
}
