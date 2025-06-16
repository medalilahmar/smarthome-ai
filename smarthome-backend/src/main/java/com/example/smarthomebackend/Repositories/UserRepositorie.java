package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<User, Integer> {

}
