package com.example.demo.controller;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("Transaction")
public class TransactionsController {

    private final TransactionService transactionService;

    @GetMapping
    public Optional<Transaction> getTransaction(@RequestParam Long id) {
        return transactionService.getTransaction(id);
    }

    @PostMapping //neither save nor idempotent
    public void saveTransaction(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
    }

    @PutMapping //idempotent
    public void updateTransaction(@RequestParam Long id, @RequestBody Transaction transaction) {
        transactionService.updateTransaction(id, transaction);
    }
    @DeleteMapping //idempotent
    public void deleteTransaction(@RequestParam Long id, @RequestBody Transaction transaction) {
        transactionService.deleteTransaction(id, transaction);
    }
}
