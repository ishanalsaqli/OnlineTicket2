package com.example.demo.service.impl;

import com.example.demo.entity.Region;
import com.example.demo.repository.RegionRepository;
import com.example.demo.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;

    @Override
    public Region getRegion(String name) {
        return regionRepository.findByName(name);
    }

   /* private Region getById(Long id) {
        return regionRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }*/

    @Override
    public Region updateRegion(Long id, Region region) {
        //var regionDb = getById(id);
        //region.setId(regionDb.getId());
        return regionRepository.save(region);
    }

    @Override
    public void saveRegion(Region region) {
        regionRepository.save(region);
    }

    @Override
    public void deleteRegion(Long id, Region region) {
        regionRepository.delete(region);
    }

}
