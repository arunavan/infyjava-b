package com.infy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.dto.AddressDTO;
import com.infy.dto.CustomerDTO;
import com.infy.entity.Address;
import com.infy.entity.Customer;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerRepository;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	/**
	 This method calls findById method of customerRepository  passing customerId received in parameter
	 @param Integer customerId
	 @return Customer object populated from entity object received from  findById method of customerRepository
	 @throws SERVICE.INVALID_CUSTOMERID exception if object received from  findById method of customerRepository is null
	 */
	@Override
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		
		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.INVALID_CUSTOMERID"));
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerId(customer.getCustomerId());
		customerDTO.setName(customer.getName());
		customerDTO.setEmailId(customer.getEmailId());
		customerDTO.setDateOfBirth(customer.getDateOfBirth());
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setAddressId(customer.getAddress().getAddressId());
		addressDTO.setCity(customer.getAddress().getCity());
		addressDTO.setStreet(customer.getAddress().getStreet());
		customerDTO.setAddress(addressDTO);
		return customerDTO;
	}
	/**
	 This method calls save method of customerRepository passing Customer entity object populated by customer object received in parameter
	 @param CustomerDTO object
	 @return Integer customerId after calling save method of customerRepository
	 */
	@Override
	public Integer addCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setCustomerId(customerDTO.getCustomerId());
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setEmailId(customerDTO.getEmailId());
		customer.setName(customerDTO.getName());
		
		Address address = new Address();
		address.setAddressId(customerDTO.getAddress().getAddressId());
		address.setCity(customerDTO.getAddress().getCity());
		address.setStreet(customerDTO.getAddress().getStreet());
		
		customer.setAddress(address);
		
		//customer , persist -customer 
		customerRepository.save(customer);   // otoo   1 rec to ucstomer 1 rec address
		return customer.getCustomerId();
	}

	/**
	 This method first calls findById method of customerRepository  passing customerId received in parameter,
	 then updates the newAddress received in parameter
	 @param Integer customerId, Address newAddress
	 @throws SERVICE.INVALID_CUSTOMERID exception if object received from  findById method of customerRepository is null
	 */
	@Override
	public void updateAddress(Integer customerId, AddressDTO addressDTO) throws InfyBankException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.INVALID_CUSTOMERID"));
		Address address = customer.getAddress();
		address.setCity(addressDTO.getCity());
		address.setStreet(addressDTO.getStreet()); //set - updates
	}
	/**
	 This method first calls findById method of customerRepository passing customerId received in parameter,
	 then calls delete method of customerRepository passing customer entity received.
	 @param Integer customerId
	 @throws SERVICE.INVALID_CUSTOMERID exception if object received from  findById method of customerRepository is null
	 */
	@Override
	public void deleteCustomer(Integer customerId) throws InfyBankException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.INVALID_CUSTOMERID"));
		customerRepository.delete(customer);
	}
	
	/**
	 This method first calls findById method of customerRepository passing customerId received in parameter,
	 then removes the address and then calls delete method of customerRepository passing customer entity received.
	 @param Integer customerId
	 @throws SERVICE.INVALID_CUSTOMERID exception if object received from  findById method of customerRepository is null
	 */
	@Override
	public void deleteCustomerOnly(Integer customerId) throws InfyBankException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.INVALID_CUSTOMERID"));
		customer.setAddress(null);
		customerRepository.delete(customer);
	}

}
