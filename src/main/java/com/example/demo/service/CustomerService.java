package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public interface CustomerService {
    Customer getCustomer(String fin);

    void saveCustomer(Customer customer) ;

    void updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id, Customer customer);

    boolean login(String username, String password) ;

}
