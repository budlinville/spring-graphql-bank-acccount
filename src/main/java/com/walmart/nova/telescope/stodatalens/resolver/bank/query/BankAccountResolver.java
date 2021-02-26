package com.walmart.nova.telescope.stodatalens.resolver.bank.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.UUID;
import org.springframework.stereotype.Component;

import com.walmart.nova.telescope.stodatalens.domain.bank.BankAccount;
import com.walmart.nova.telescope.stodatalens.domain.bank.Client;
import com.walmart.nova.telescope.stodatalens.domain.bank.Currency;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
	public BankAccount bankAccount(UUID id) {
		log.info("Retrieving bank account id: {}", id);
		
		return BankAccount.builder()
			.id(id)
			.currency(Currency.USD)
			.build();
	}
}