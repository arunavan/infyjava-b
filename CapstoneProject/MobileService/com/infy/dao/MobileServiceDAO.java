package com.infy.dao;

import java.util.List;

import com.infy.model.ServiceRequest;

public interface MobileServiceDAO {
	public ServiceRequest registerRequest(ServiceRequest service) ;
	public List<ServiceRequest> getServices() ;
}
