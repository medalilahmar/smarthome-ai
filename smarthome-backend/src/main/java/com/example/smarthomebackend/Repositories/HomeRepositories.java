package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.Home;
import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeRepositories extends JpaRepository<Home, Long> {
    List<Home> findByUserId(Long userId);
}
