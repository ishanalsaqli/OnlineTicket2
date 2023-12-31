package com.example.demo.service.impl;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Override
    public Vehicle getVehicle(String serial) {
        // Vehicle vehicle= VehicleRepository.findBySerial(name);
        return vehicleRepository.findBySerial(serial);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        return vehicleRepository.save(vehicle) ;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
         vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(Long id, Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }

}
