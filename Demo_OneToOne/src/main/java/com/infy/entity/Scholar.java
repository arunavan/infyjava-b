package com.infy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Scholar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer scholarId;
	String name;
	String course;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="laptopId",unique=true)
	Laptop laptop;
	
	
	
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



	public Laptop getLaptop() {
		return laptop;
	}



	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}



	@Override
	public String toString() {
		return "Scholar [scholarId=" + scholarId + ", name=" + name + ", course=" + course + ", laptop=" + laptop + "]";
	}

}
