package com.example.demo.service;

import com.example.demo.entity.Destination;
import org.springframework.stereotype.Service;

@Service
public interface DestinationService {
    Destination getDestination(long id);

    void saveDestination(Destination destination);
    Destination updateDestination(Long id, Destination destination);
    void deleteDestination (Long id, Destination destination);
}
