package com.infy.service;

import java.util.List;
import com.infy.validator.Validator;
import com.infy.dao.MobileServiceDAO;
import com.infy.dao.MobileServiceDAOImpl;
import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceReport;
import com.infy.model.ServiceRequest;
import com.infy.model.Status;

public class MobileServiceImpl implements MobileService{
	
	private MobileServiceDAO dao =  new MobileServiceDAOImpl();
        private Validator validator=new Validator();

	@Override
	public ServiceRequest registerRequest(ServiceRequest service) throws MobileServiceException {
		return null;
	}

	@Override
	public Float calculateEstimateCost(List<String> issues) throws MobileServiceException {
		return null;
	}

	@Override
	public List<ServiceReport> getServices(Status status) throws MobileServiceException {
		
		return dao.getServices();
	}

}
