package dev.rafaelreis.hexagonal.application.core.usercase;

import dev.rafaelreis.hexagonal.application.core.domain.Customer;
import dev.rafaelreis.hexagonal.application.ports.in.InsertCustomerInputPort;
import dev.rafaelreis.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import dev.rafaelreis.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
	
	private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
	private final InsertCustomerOutputPort insertCustomerOutputPort;

	public InsertCustomerUseCase(
			FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
			InsertCustomerOutputPort insertCustomerOutputPort) {
		this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
		this.insertCustomerOutputPort = insertCustomerOutputPort;
	}

	@Override
	public void insert(Customer customer, String zipCode) {
		var address = findAddressByZipCodeOutputPort.find(zipCode);
		customer.setAddress(address);
		insertCustomerOutputPort.insert(customer);
	}
}
