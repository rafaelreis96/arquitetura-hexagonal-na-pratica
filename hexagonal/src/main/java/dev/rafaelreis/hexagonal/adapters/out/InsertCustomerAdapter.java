package dev.rafaelreis.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;

import dev.rafaelreis.hexagonal.adapters.out.repository.CustomerRepository;
import dev.rafaelreis.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import dev.rafaelreis.hexagonal.application.core.domain.Customer;
import dev.rafaelreis.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerAdapter implements InsertCustomerOutputPort {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerEntityMapper customerEntityMapper;

	@Override
	public void insert(Customer customer) {
		var customerEntity = customerEntityMapper.toCustomerEntity(customer);
		customerRepository.save(customerEntity);
	}

}
