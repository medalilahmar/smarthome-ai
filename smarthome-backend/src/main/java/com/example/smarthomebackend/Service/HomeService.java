package com.example.smarthomebackend.Service;

import com.example.smarthomebackend.Entites.Home;
import com.example.smarthomebackend.Entites.User;
import com.example.smarthomebackend.Repositories.HomeRepositories;
import com.example.smarthomebackend.Repositories.UserRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeService implements IHomeService{

     HomeRepositories homeRepository;
     UserRepositorie userRepository;

    public HomeService(HomeRepositories homeRepository, UserRepositorie userRepository) {
        this.homeRepository = homeRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Home createHome(Home home, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        home.setUser(user);
        return homeRepository.save(home);
    }

    @Override
    public Optional<Home> getHome(Long id) {
        return homeRepository.findById(id);
    }

    @Override
    public List<Home> getHomesByUserId(Long userId) {
        return homeRepository.findByUserId(userId);
    }

    @Override
    public Home updateHome(Long id, Home updatedHome) {
        return homeRepository.findById(id)
                .map(home -> {
                    home.setName(updatedHome.getName());
                    home.setAddress(updatedHome.getAddress());
                    return homeRepository.save(home);
                })
                .orElseThrow(() -> new IllegalArgumentException("Home not found"));
    }

    @Override
    public void deleteHome(Long id) {
        if (!homeRepository.existsById(id)) {
            throw new IllegalArgumentException("Home not found");
        }
        homeRepository.deleteById(id);
    }
}
