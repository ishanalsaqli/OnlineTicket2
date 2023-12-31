package com.example.demo.service.impl;


import com.example.demo.entity.Destination;
import com.example.demo.repository.DestinationRepository;
import com.example.demo.service.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DestinationServiceImpl implements DestinationService {
    private final DestinationRepository destinationRepository;

    @Override
    public Destination getDestination(long id) {
        return destinationRepository.findById(id);
    }

    @Override
    public void saveDestination(Destination destination) {
        destinationRepository.save(destination);
    }

    @Override
    public Destination updateDestination(Long id, Destination destination) {
        return  destinationRepository.save(destination);
    }

    @Override
    public void deleteDestination(Long id, Destination destination) {
        destinationRepository.delete(destination);
    }
}
