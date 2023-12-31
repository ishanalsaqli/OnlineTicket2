package com.example.demo.controller;

import com.example.demo.entity.Destination;
import com.example.demo.service.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("destination")
public class DestinationController {
    private final DestinationService destinationService;

    @GetMapping
    public Destination getDestination(@RequestParam long id){
        return destinationService.getDestination(id);
    }
    @PostMapping //neither save nor idempotent
    public void saveDestination(@RequestBody Destination Destination) {
        destinationService.saveDestination(Destination);
    }

    @PutMapping //idempotent
    public void updateDestination(@RequestParam Long id, @RequestBody Destination destination ) {
        destinationService.updateDestination(id, destination);
    }
    @DeleteMapping //idempotent
    public void deleteDestination(@RequestParam Long id, @RequestBody Destination Destination) {
        destinationService.deleteDestination(id, Destination);
    }
}
