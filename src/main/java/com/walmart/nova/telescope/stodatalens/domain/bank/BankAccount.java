package com.walmart.nova.telescope.stodatalens.domain.bank;

import java.util.UUID;
import lombok.Value;
import lombok.Builder;

@Builder
@Value
public class BankAccount {
	UUID id;
	Client client;
	Currency currency;
}
