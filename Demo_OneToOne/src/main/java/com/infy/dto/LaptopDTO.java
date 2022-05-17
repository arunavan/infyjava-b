package com.infy.dto;

public class LaptopDTO {
	Integer laptopId;
	String brand;
	Double price;
	public Integer getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "LaptopDTO [laptopId=" + laptopId + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
