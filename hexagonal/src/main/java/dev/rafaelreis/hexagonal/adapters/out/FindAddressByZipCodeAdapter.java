package dev.rafaelreis.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.rafaelreis.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import dev.rafaelreis.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import dev.rafaelreis.hexagonal.application.core.domain.Address;
import dev.rafaelreis.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

	@Autowired
	private FindAddressByZipCodeClient findAddressByZipCodeClient;
	
	@Autowired
	private AddressResponseMapper addressResponseMapper;
	
	@Override
	public Address find(String zioCode) {
		var addressResponse  = findAddressByZipCodeClient.find(zioCode);
		return addressResponseMapper.toAddress(addressResponse);
	}

}
