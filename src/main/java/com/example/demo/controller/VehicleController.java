package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping
    public Vehicle getVehicle(@RequestParam String serial) {
        return vehicleService.getVehicle(serial);
    }

    @PostMapping //neither save nor idempotent
    public void saveVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
    }

    @PutMapping //idempotent
    public void updateVehicle(@RequestParam Long id, @RequestBody Vehicle vehicle) {
        vehicleService.updateVehicle(id, vehicle);
    }
    @DeleteMapping //idempotent
    public void deleteVehicle(@RequestParam Long id, @RequestBody Vehicle vehicle) {
        vehicleService.deleteVehicle(id, vehicle);
    }
}
