package com.app.CoreClasses;

import java.util.Objects;

@SuppressWarnings("unused")
public class Pets 
{
	private int petId;
	private String name;
	private PetCategory category;
	private int unitPrice;
	private int stocks;
	
	public Pets(int petId, String name, PetCategory category, int unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	
	public Pets(int petId) 
	{
		super();
		this.petId = petId;
	}

//	public Pets(int id, String name2, PetCategory c, double unit_price, int stock) 
//	{
//		this.petId=id;
//		this.name=name2;
//		this.category=c;
//		this.unitPrice=unit_price;
//	}

	public int getPetId() 
	{
		return petId;
	}
	
	public void setPetId(int petId) 
	{
		this.petId = petId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public PetCategory getCategory() 
	{
		return category;
	}
	
	public void setCategory(PetCategory category) 
	{
		this.category = category;
	}
	
	public int getUnitPrice() 
	{
		return unitPrice;
	}
	
	public void setUnitPrice(int unitPrice) 
	{
		this.unitPrice = unitPrice;
	}
	
	public int getStocks() 
	{
		return stocks;
	}
	
	public void setStocks(int stocks) 
	{
		this.stocks = stocks;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(petId);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		return petId == other.petId;
	}
	
	@Override
	public String toString() {
		return "Pets [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}
	
	
}
