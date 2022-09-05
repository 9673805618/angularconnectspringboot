package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Address;
import com.mindgate.main.repository.AddressDetailRepositoryInterface;

@Service
public class AddressService implements AddressDetailServiceInterface {

	@Autowired
	private AddressDetailRepositoryInterface addressDetailRepositoryInterface;
	@Override
	public boolean addressNewAddress(Address address) {
		System.out.println(address);
		return addressDetailRepositoryInterface.addressNewAddress(address);
	}

	@Override
	public List<Address> getAllAddress() {
		return addressDetailRepositoryInterface.getAllAddress();
	}

}
