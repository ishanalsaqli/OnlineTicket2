package com.example.demo.controller;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("driver")
public class DriverController {
    private final DriverService driverService;

    @GetMapping
    public Driver getDriver(@RequestParam String fin){
        return driverService.getDriver(fin);
    }
    @PostMapping //neither save nor idempotent
    public void saveDriver(@RequestBody Driver Driver) {
        driverService.saveDriver(Driver);
    }

    @PutMapping //idempotent
    public void updateDriver(@RequestParam Long id, @RequestBody Driver Driver) {
        driverService.updateDriver(id, Driver);
    }
    @DeleteMapping //idempotent
    public void deleteDriver(@RequestParam Long id, @RequestBody Driver Driver) {
        driverService.deleteDriver(id, Driver);
    }
}
