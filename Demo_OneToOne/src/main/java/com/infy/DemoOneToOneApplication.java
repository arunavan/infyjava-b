package com.infy;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.dto.AddressDTO;
import com.infy.dto.CustomerDTO;
import com.infy.dto.LaptopDTO;
import com.infy.dto.ScholarDTO;
import com.infy.service.CustomerService;
import com.infy.service.ScholarService;

@SpringBootApplication
public class DemoOneToOneApplication implements CommandLineRunner {
	
	public static final Log LOGGER = LogFactory.getLog(DemoOneToOneApplication.class);

	@Autowired
	CustomerService customerService;
	
	@Autowired
	ScholarService scholarService;


	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(DemoOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		addScholar();
		// addCustomer();
		//getCustomer();
	
	//	 updateAddress();
	//deleteCustomer();
		// deleteCustomerOnly();

	}
	
	public void addScholar() {
		
		ScholarDTO scholarDTO=new ScholarDTO();
		//1 laptop
		LaptopDTO laptopDTO=new LaptopDTO();
		laptopDTO.setBrand("Dell");
		laptopDTO.setPrice(99999.99);
		//1 scholar 
		scholarDTO.setName("Ram");
		scholarDTO.setCourse("JavaFSD");
		scholarDTO.setLaptopDTO(laptopDTO);
		scholarService.addScholar(scholarDTO);
		LOGGER.info("Scholar added successfully");
		
	}
	
	public void getCustomer() {

		try {

			CustomerDTO customerDTO = customerService.getCustomer(7);
			LOGGER.info(customerDTO);

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exsception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}

	public void addCustomer() {
		try {

			CustomerDTO customerDTO = new CustomerDTO();

			customerDTO.setName("Anshul");
			customerDTO.setEmailId("Anshul@infy.com");
			customerDTO.setDateOfBirth(LocalDate.of(1999, 03, 24));

			AddressDTO addressDTO = new AddressDTO();
			//addressDTO.setAddressId(103L);
			addressDTO.setCity("Pune");
			addressDTO.setStreet("Hinjawada-1");

			AddressDTO addressDTO1 = new AddressDTO();
			//addressDTO.setAddressId(103L);
			addressDTO1.setCity("Pune2");
			addressDTO1.setStreet("Hinjawada-12");

			
			customerDTO.setAddress(addressDTO);
			customerDTO.setAddress(addressDTO1);
			

			Integer customerId = customerService.addCustomer(customerDTO);
			LOGGER.info("\n" + environment.getProperty("UserInterface.CUSTOMER_ADDED") + customerId);

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}

	public void updateAddress() {

		try {

			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setCity("winchester");
			addressDTO.setStreet("14 Tim Street");

			customerService.updateAddress(9, addressDTO);
			LOGGER.info("\n" + environment.getProperty("UserInterface.CUSTOMER_UPDATED"));

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}

	}

	public void deleteCustomer() {

		try {

			customerService.deleteCustomer(9);
			LOGGER.info("\n" + environment.getProperty("UserInterface.CUSTOMER_ADDRESS_DELETED"));

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}
	
	public void deleteCustomerOnly() {

		try {

			customerService.deleteCustomerOnly(8);
			LOGGER.info("\n" + environment.getProperty("UserInterface.CUSTOMER_DELETED"));

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}

}
