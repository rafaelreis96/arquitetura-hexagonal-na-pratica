package dev.rafaelreis.hexagonal.application.ports.out;

import dev.rafaelreis.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

	void insert(Customer customer);
	
}
