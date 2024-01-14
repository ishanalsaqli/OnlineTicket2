package com.example.demo.service;

import com.example.demo.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface TransactionService {
    Optional<Transaction> getTransaction(Long id);

    void saveTransaction(Transaction transactions) ;

    void updateTransaction(Long id, Transaction transactions);

    void deleteTransaction(Long id, Transaction transactions);


}
