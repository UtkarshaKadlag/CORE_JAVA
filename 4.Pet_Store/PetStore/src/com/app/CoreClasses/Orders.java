package com.app.CoreClasses;

import java.util.Objects;

import com.app.CoreClasses.Status;

public class Orders 
{
	private int orderId;
	private int petId;
	private int quantity;
	private Status status;
	
	public Orders(int orderId, int petId, int quantity, Status status) 
	{
		super();
		this.orderId = orderId;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
	}
	
	

	public Orders(int orderId) {
		super();
		this.orderId = orderId;
	}



	public Orders(int id, int quantity) 
	{
		this.petId=id;
		this.quantity=quantity;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}



	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return orderId == other.orderId;
	}



	@Override
	public String toString() 
	{
		return "Orders : orderId=" + orderId + 
				" petId=" + petId + 
				" quantity=" + quantity + 
				" status=" + status;
	}

	
	
	
}
