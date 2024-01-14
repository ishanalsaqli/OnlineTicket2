package com.example.demo.service.impl;


import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final EmailSenderService emailService;

    @Override
    public Customer getCustomer(String fin) {
        return customerRepository.findByFin(fin);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
        emailService.sendmail(customer.getMail(),
                customer.getFullname() + " ,ugurla qeydiyyatdan kecdin", "Qeydiyyat");
    }

    @Override
    public void updateCustomer(Long id, Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id, Customer customer) {
        customerRepository.delete(customer);
    }

    public boolean login(String username, String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return customerRepository.findByUsername(username)
                .map(value -> passwordEncoder.matches(password,value.getPassword()))
                .orElse(false);
    }


}
