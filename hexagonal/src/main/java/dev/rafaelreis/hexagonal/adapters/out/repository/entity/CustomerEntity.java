package dev.rafaelreis.hexagonal.adapters.out.repository.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import dev.rafaelreis.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
@Document(collection = "customers")
public class CustomerEntity {
	
	private String id;
	private String name;
	private Address address;
	private String cpf;
	private Boolean isValidCpf;
	
}
