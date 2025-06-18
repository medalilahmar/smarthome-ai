package com.example.smarthomebackend.Repositories;

import com.example.smarthomebackend.Entites.Device;
import com.example.smarthomebackend.Entites.Room;
import com.example.smarthomebackend.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepositories extends JpaRepository<Device, Long> {
    List<Device> findByRoom(Room room);
    List<Device> findByRoomId(Long roomId);

}
