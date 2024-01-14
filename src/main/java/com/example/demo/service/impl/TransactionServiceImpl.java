package com.example.demo.service.impl;


import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;


    @Override
    public Optional<Transaction> getTransaction(Long id) {
        return transactionRepository.findById(id);
    }

    @Override
    public void saveTransaction(Transaction transactions) {
        transactionRepository.save(transactions);
    }

    @Override
    public void updateTransaction(Long id, Transaction transactions) {
        transactionRepository.save(transactions);
    }

    @Override
    public void deleteTransaction(Long id, Transaction transactions) {
        transactionRepository.delete(transactions);
    }
}
