package dev.rafaelreis.hexagonal.application.ports.out;

import dev.rafaelreis.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

	Address find(String zioCode);
}
