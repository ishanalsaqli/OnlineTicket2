package com.example.demo.service;

import com.example.demo.entity.Travel;
import org.springframework.stereotype.Service;

@Service
public interface TravelService {

    Travel getTravel(long id);

    Travel updateTravel(Long id, Travel travel);

    void saveTravel(Travel travel);
    void deleteTravel (Long id, Travel travel);

}
