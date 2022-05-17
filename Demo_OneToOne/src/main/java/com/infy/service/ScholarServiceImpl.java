package com.infy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.LaptopDTO;
import com.infy.dto.ScholarDTO;
import com.infy.entity.Laptop;
import com.infy.entity.Scholar;
import com.infy.repository.ScholarRepository;
@Service
@Transactional
public class ScholarServiceImpl implements ScholarService {
	@Autowired
	ScholarRepository scholarRepository;
	public void addScholar(ScholarDTO scholarDTO) {// DTO to entity mapping
		Scholar scholar=new Scholar();
		scholar.setScholarId(scholarDTO.getScholarId());
		scholar.setCourse(scholarDTO.getCourse());
		scholar.setName(scholarDTO.getName());
		Laptop laptop=new Laptop();   //DTO to entity
		//LaptopDTO laptopDTO=scholarDTO.getLaptopDTO();
		
		laptop.setLaptopId(scholarDTO.getLaptopDTO().getLaptopId());
		laptop.setBrand(scholarDTO.getLaptopDTO().getBrand());
		laptop.setPrice(scholarDTO.getLaptopDTO().getPrice());
		scholar.setLaptop(laptop);
		
		scholarRepository.save(scholar);
		
	}
}
