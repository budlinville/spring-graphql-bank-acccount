package com.walmart.nova.telescope.stodatalens.resolver.bank;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.walmart.nova.telescope.stodatalens.domain.bank.BankAccount;
import com.walmart.nova.telescope.stodatalens.domain.bank.Client;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
	public Client client(BankAccount bankAccount) {
		log.info("Requesting client data for bank account id {)", bankAccount.getId());
		
		return Client.builder()
				.id(UUID.randomUUID())
				.firstName("Bud")
				.lastName("Linville")
				.build();
				
	}
}
