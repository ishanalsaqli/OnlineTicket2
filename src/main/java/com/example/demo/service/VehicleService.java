package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import org.springframework.stereotype.Service;

@Service
public interface VehicleService {

    Vehicle getVehicle(String serial);

    Vehicle updateVehicle(Long id, Vehicle vehicle);

    void saveVehicle(Vehicle vehicle);
    void deleteVehicle (Long id, Vehicle vehicle);

}
