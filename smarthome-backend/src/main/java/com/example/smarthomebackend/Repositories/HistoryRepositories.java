package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.History;
import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoryRepositories extends JpaRepository<History, Long> {
    List<History> findByUserId(Long userId);
}
