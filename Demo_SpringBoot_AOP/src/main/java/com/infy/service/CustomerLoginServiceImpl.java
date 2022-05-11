package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;

	
	//  before  , after afterthrowing, after returning 
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
	
		String toRet = null;
		CustomerLoginDTO customerLoginFromRepository = 
				customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toRet = "SUCCESS";
		} else {
			throw new InfyBankException("Service.WRONG_CREDENTIALS");
		}
		return toRet;
		
		
	}
	
	public int getNumber()  throws InfyBankException {
		int x=8;
		if( x<0)
			throw new InfyBankException("MyException");
		return 1;
	}
	/*
	 * public Boolean authenticateCustomer(String s) throws InfyBankException {
	 * 
	 * String toRet = null; CustomerLoginDTO customerLoginFromRepository =
	 * customerLoginRepository.getCustomerLoginByLoginName("xxx"); if
	 * ("xxx".equals(customerLoginFromRepository.getPassword())) { toRet =
	 * "SUCCESS"; } else { throw new InfyBankException("Service.WRONG_CREDENTIALS");
	 * } return true;
	 */
}