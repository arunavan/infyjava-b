package com.infy.userinterface;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceReport;
import com.infy.model.ServiceRequest;
import com.infy.model.Status;
import com.infy.service.MobileService;
import com.infy.service.MobileServiceImpl;

public class MobileServiceTester {
	public static void main(String[] args) {

		//String s="(\d)\1{9}";
		//		System.out.println("999999".matches(s));
			//registerRequest();
			//getServices();

	}
	
	public static void registerRequest(){
		MobileService service = new MobileServiceImpl();
		try {
			ServiceRequest obj = new ServiceRequest("Abc", Arrays.asList("Battery"), 9876543210L,"Chap",3214567890123456L);
			obj = service.registerRequest(obj);
			System.out.println("Service request has been accepted with the request ID: "+ obj.getServiceId() +", status of the request is "+obj.getStatus()+" on "+obj.getTimeOfRequest().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy  hh:mm:ss")));
		} catch (MobileServiceException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void getServices(){
		MobileService service = new MobileServiceImpl();
		try {
			
			List<ServiceReport> list = service.getServices(Status.REJECTED); 
			System.out.println("=================================");
			System.out.println(" ID \t Brand \t\t Fee");
			System.out.println("=================================");
			list.stream().forEach(obj->{
//				uncomment the below line when you have implemented the ServiceReport class
//				System.out.println(obj.getServiceId()+"\t"+obj.getBrand()+"\t"+obj.getServiceFee()+" $");
			});
			System.out.println("=================================");
		} catch (MobileServiceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
