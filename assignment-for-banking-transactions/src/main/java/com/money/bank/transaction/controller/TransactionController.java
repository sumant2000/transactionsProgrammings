package com.money.bank.transaction.controller;

import com.money.bank.transaction.model.Transaction;
import com.money.bank.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction savedTransaction = transactionRepository.save(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTransaction);
    }


    @GetMapping
    public ResponseEntity<Transaction> getTransaction(@RequestParam("id") String sourceAccountId) {
        List<Transaction> listOfTransaction = transactionRepository.findBySourceAccountId(sourceAccountId);
        if (listOfTransaction.size()>0) {
            Transaction transaction = listOfTransaction.get(0);
            return ResponseEntity.ok(transaction);
        } else {
            return ResponseEntity.notFound().build();
        }
    }






}
