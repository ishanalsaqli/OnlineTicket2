package com.example.demo.service;

import com.example.demo.entity.Driver;
import org.springframework.stereotype.Service;

@Service
public interface DriverService {
    Driver getDriver(String fin);
    void saveDriver(Driver driver);
    Driver updateDriver(Long id, Driver driver);
    void deleteDriver (Long id, Driver driver);
}
