package com.example.demo.service;

import com.example.demo.entity.Region;
import org.springframework.stereotype.Service;

@Service
public interface RegionService {

    Region getRegion(String name);

    Region updateRegion(Long id, Region region);

    void saveRegion(Region region);
    void deleteRegion (Long id, Region region);

}
