package dev.rafaelreis.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import dev.rafaelreis.hexagonal.adapters.out.repository.entity.CustomerEntity;
import dev.rafaelreis.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

	CustomerEntity toCustomerEntity(Customer customer);

}