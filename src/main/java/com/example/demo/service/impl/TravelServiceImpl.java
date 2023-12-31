package com.example.demo.service.impl;


import com.example.demo.entity.Travel;
import com.example.demo.repository.TravelRepository;
import com.example.demo.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService {
    private final TravelRepository travelRepository;
    @Override
    public Travel getTravel(long id) {
        return travelRepository.findById(id);
    }

    @Override
    public Travel updateTravel(Long id, Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public void saveTravel(Travel travel) {
         travelRepository.save(travel);
    }

    @Override
    public void deleteTravel(Long id, Travel travel) {
        travelRepository.delete(travel);
    }
}
