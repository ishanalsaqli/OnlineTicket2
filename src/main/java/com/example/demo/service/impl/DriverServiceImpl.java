package com.example.demo.service.impl;


import com.example.demo.entity.Driver;
import com.example.demo.repository.DriverRepository;
import com.example.demo.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    @Override
    public Driver getDriver(String fin) {
      //  Driver driver= driverRepository.findByFin(fin);
        return driverRepository.findByFin(fin);
    }

    @Override
    public void saveDriver(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Long id, Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public void deleteDriver(Long id, Driver driver) {
        driverRepository.delete(driver);
    }
}
