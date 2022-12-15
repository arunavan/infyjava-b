package com.infy.service;

import java.util.List;

import com.infy.model.ServiceRequest;
import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceReport;
import com.infy.model.Status;

public interface MobileService {
	public ServiceRequest registerRequest(ServiceRequest service) throws MobileServiceException;
	public Float calculateEstimateCost(List<String> issues) throws MobileServiceException;
	public List<ServiceReport> getServices(Status status) throws MobileServiceException;
}
