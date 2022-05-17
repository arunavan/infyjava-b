package com.infy.service;

import com.infy.dto.AddressDTO;
import com.infy.dto.CustomerDTO;
import com.infy.exception.InfyBankException;

public interface CustomerService {

	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException;
	public Integer addCustomer(CustomerDTO customerDTO);
	public void updateAddress(Integer customerId, AddressDTO addressDTO) throws InfyBankException;
	public void deleteCustomer(Integer customerId) throws InfyBankException;
	public void deleteCustomerOnly(Integer customerId) throws InfyBankException;
}
