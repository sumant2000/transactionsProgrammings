package com.money.bank.transaction.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.money.bank.transaction.model.Transaction;
import com.money.bank.transaction.repository.TransactionRepository;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TransactionControllerTest {

    @Mock
    private TransactionRepository transactionRepository;

    private TransactionController transactionController;

    @BeforeEach
    void setUp() {
        transactionController = new TransactionController(transactionRepository);
    }

    @AfterEach
    void tearDown() {
        transactionRepository.deleteAll();
    }

    @Test
    void createTransaction_ShouldReturnCreatedTransaction() {
        // given
        Transaction transaction = new Transaction();
        transaction.setAmount(1000.0);

        when(transactionRepository.save(any(Transaction.class))).thenReturn(transaction);

        // when
        ResponseEntity<Transaction> response = transactionController.createTransaction(transaction);

        // then
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(transaction, response.getBody());
    }
}
