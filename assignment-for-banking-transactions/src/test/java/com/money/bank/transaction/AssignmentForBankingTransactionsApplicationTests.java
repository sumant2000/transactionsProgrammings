package com.money.bank.transaction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AssignmentForBankingTransactionsApplicationTests {

	@Autowired
	private AssignmentForBankingTransactionsApplication application;

	@Test
	void contextLoads() {
		assertNotNull(application);
	}

}
