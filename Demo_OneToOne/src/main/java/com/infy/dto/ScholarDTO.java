package com.infy.dto;

public class ScholarDTO {
	Integer scholarId;
	String name;
	String course;
	LaptopDTO laptopDTO;
	
	
	public Integer getScholarId() {
		return scholarId;
	}
	public void setScholarId(Integer scholarId) {
		this.scholarId = scholarId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public LaptopDTO getLaptopDTO() {
		return laptopDTO;
	}
	public void setLaptopDTO(LaptopDTO laptopDTO) {
		this.laptopDTO = laptopDTO;
	}
	@Override
	public String toString() {
		return "ScholarDTO [scholarId=" + scholarId + ", name=" + name + ", course=" + course + ", laptopDTO="
				+ laptopDTO + "]";
	}
	
	
}
