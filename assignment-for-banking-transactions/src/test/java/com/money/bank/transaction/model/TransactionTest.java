package com.money.bank.transaction.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TransactionTest {

    private Transaction transaction;

    @BeforeEach
    void setUp() {
        transaction = new Transaction();
    }

    @AfterEach
    void tearDown() {
        transaction = null;
    }

    @Test
    void getId() {
        assertNull(transaction.getId());
    }

    @Test
    void getCurrency() {
        assertNull(transaction.getCurrency());
    }

    @Test
    void getAmount() {
        assertNull(transaction.getAmount());
    }

    @Test
    void getSourceAccountId() {
        assertNull(transaction.getSourceAccountId());
    }

    @Test
    void setId() {
        Long id = 1L;
        transaction.setId(id);
        assertEquals(id, transaction.getId());
    }

    @Test
    void setCurrency() {
        String currency = "USD";
        transaction.setCurrency(currency);
        assertEquals(currency, transaction.getCurrency());
    }

    @Test
    void setAmount() {
        Double amount = 1000.0;
        transaction.setAmount(amount);
        assertEquals(amount, transaction.getAmount());
    }

    @Test
    void setSourceAccountId() {
        Long accountId = 1234L;
        transaction.setSourceAccountId(String.valueOf(accountId));
        assertEquals(String.valueOf(accountId), transaction.getSourceAccountId());
    }
}
