package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.impl.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequiredArgsConstructor
@RequestMapping("Customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping(/*"/we"*/)
    public Customer getCustomer(@RequestParam String fin){
        return customerService.getCustomer(fin);
    }

    @GetMapping("/login")
    public boolean Login (@RequestParam String username,@RequestParam String password) throws NoSuchAlgorithmException {
        return customerService.login(username, password);
    }


    @PostMapping //neither save nor idempotent
    public void saveCustomer(@RequestBody Customer customer) throws NoSuchAlgorithmException {
        customerService.saveCustomer(customer);
    }

    @PutMapping //idempotent
    public void updateCustomer(@RequestParam Long id, @RequestBody Customer customer ) {
        customerService.updateCustomer(id, customer);
    }
    @DeleteMapping //idempotent
    public void deleteCustomer(@RequestParam Long id, @RequestBody Customer customer) {
        customerService.deleteCustomer(id, customer);
    }
}
