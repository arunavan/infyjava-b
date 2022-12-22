package com.ims.model;

import java.util.Objects;

public class Product {
	Integer id;
	String name;
	Double unitPrice;
    Double qty;
    
    public Product() {}
	public Product(Integer id, String name, Double unitPrice, Double qty) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public Double getQty() {
		return qty;
	}


	public void setQty(Double qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", qty=" + qty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, qty, unitPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(qty, other.qty)
				&& Objects.equals(unitPrice, other.unitPrice);
	}
	
    
}
