package com.example.demo.controller;

import com.example.demo.entity.Travel;
import com.example.demo.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("travel")
public class TravelController {

    private final TravelService travelService;

    @GetMapping
    public Travel getTravel(@RequestParam long id) {
        return travelService.getTravel(id);
    }

    @PostMapping //neither save nor idempotent
    public void saveTravel(@RequestBody Travel travel) {
        travelService.saveTravel(travel);
    }

    @PutMapping //idempotent
    public void updateTravel(@RequestParam Long id, @RequestBody Travel travel) {
        travelService.updateTravel(id, travel);
    }
    @DeleteMapping //idempotent
    public void deleteTravel(@RequestParam Long id, @RequestBody Travel travel) {
        travelService.deleteTravel(id, travel);
    }

}
