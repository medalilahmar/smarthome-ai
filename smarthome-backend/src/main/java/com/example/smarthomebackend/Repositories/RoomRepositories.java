package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.Room;
import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepositories extends JpaRepository<Room, Long> {
    List<Room> findByHomeId(Long homeId);
}
