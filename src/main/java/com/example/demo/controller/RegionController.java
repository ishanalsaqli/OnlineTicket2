package com.example.demo.controller;

import com.example.demo.entity.Region;
import com.example.demo.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("region")
public class RegionController {

    private final RegionService regionService;

    @GetMapping //save
    public Region getRegion(@RequestParam String name) {
        return regionService.getRegion(name);
    }

    @PostMapping //neither save nor idempotent
    public void saveRegion(@RequestBody Region region) {
        regionService.saveRegion(region);
    }

    @PutMapping //idempotent
    public void updateRegion(@RequestParam Long id, @RequestBody Region region) {
        regionService.updateRegion(id, region);
    }
    @DeleteMapping //idempotent
    public void deleteRegion(@RequestParam Long id, @RequestBody Region region) {
        regionService.deleteRegion(id, region);
    }



}
