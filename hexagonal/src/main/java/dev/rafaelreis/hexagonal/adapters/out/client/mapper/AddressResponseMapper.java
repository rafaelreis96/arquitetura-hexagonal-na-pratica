package dev.rafaelreis.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import dev.rafaelreis.hexagonal.adapters.out.client.response.AddressResponse;
import dev.rafaelreis.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

	Address toAddress(AddressResponse addressResponse);
}
