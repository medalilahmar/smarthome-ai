package com.example.smarthomebackend.Service;

import com.example.smarthomebackend.Entites.Home;

import java.util.List;
import java.util.Optional;

public interface IHomeService {
    Home createHome(Home home, Long userId);
    Optional<Home> getHome(Long id);
    List<Home> getHomesByUserId(Long userId);
    Home updateHome(Long id, Home home);
    void deleteHome(Long id);
}
